Sub GoodsProp()
Call WriteTextADO("select * from CM_SYOUHINZOKUSEI")
End Sub

Sub PlanMst()
Call WriteText("select * from EM_Plan")
End Sub

Sub PlanGoodsMst()
Call WriteText("select * from EM_PlanSyouhin")
End Sub

Sub ROW()
Call WriteText(ActiveSheet.Cells(11, 15).Value)
End Sub

Sub COL()
Call WriteTextADO(ActiveSheet.Cells(11, 15).Value)
End Sub

Private Sub WriteTextADO(sql As String)
Dim ROW As Integer
Dim COL As Integer
serverName = ActiveSheet.Cells(3, 14).Value
UserName = ActiveSheet.Cells(4, 14).Value
Password = ActiveSheet.Cells(5, 14).Value
colind = 3
rowind = 3
Set cn = CreateObject("ADODB.Connection")
Set rs = CreateObject("ADODB.Recordset")
cn.ConnectionString = "Provider=OraOLEDB.Oracle;Data Source=" & serverName & ";User ID=" & UserName & ";Password=" & Password & ";"
cn.Open
rs.Open sql, cn
Dim oldSheet As Worksheet
Dim newSheet As Worksheet
Set oldSheet = ActiveSheet
Worksheets.Add after:=Worksheets(Worksheets.Count)
Set newSheet = ActiveSheet
oldSheet.Activate
newSheet.Cells.NumberFormat = "@"
Dim i As Integer
i = 0
Do Until rs.EOF
For j = 0 To rs.fields.Count - 1
COL = i + rowind
ROW = j + colind
If i = 0 Then
newSheet.Cells(ROW, COL) = rs.fields(j).Name
newSheet.Cells(ROW, COL).Interior.Color = RGB(153, 255, 153)
newSheet.Cells(ROW, COL - 1) = GetTitle(rs.fields(j).Name)
newSheet.Cells(ROW, COL - 1).Interior.Color = RGB(112, 48, 160)
newSheet.Cells(ROW, COL - 1).Font.Color = RGB(255, 255, 255)
Else
newSheet.Cells(ROW, COL) = rs.fields(j).Value
End If
newSheet.Cells(ROW, COL).EntireColumn.AutoFit
newSheet.Cells(ROW, COL).Borders.LineStyle = xlContinuous
Next j
If i > 0 Then
rs.MoveNext
End If
i = i + 1
Loop
'オブジェクトのクローズ
rs.Close
cn.Close
'オブジェクトの開放
Set rs = Nothing
Set cn = Nothing
End Sub

Private Sub WriteText(sql As String)
serverName = ActiveSheet.Cells(3, 14).Value
UserName = ActiveSheet.Cells(4, 14).Value
Password = ActiveSheet.Cells(5, 14).Value
colind = 2
rowind = 3
Set Session = CreateObject("OracleInProcServer.XOraSession")
Set Db = Session.OpenDatabase(serverName, UserName & "/" & Password, 0&)
Set dset = Db.CreateDynaset(sql, 0&)
Dim oldSheet As Worksheet
Dim newSheet As Worksheet
Set oldSheet = ActiveSheet
Worksheets.Add after:=Worksheets(Worksheets.Count)
Set newSheet = ActiveSheet
oldSheet.Activate
newSheet.Cells.NumberFormat = "@"
For i = 0 To dset.RecordCount
For j = 0 To dset.fields.Count - 1
If i = 0 Then
newSheet.Cells(i + rowind, j + colind) = dset.fields(j).Name
newSheet.Cells(i + rowind, j + colind).Interior.Color = RGB(153, 255, 153)
newSheet.Cells(i - 1 + rowind, j + colind) = GetTitle(dset.fields(j).Name)
newSheet.Cells(i - 1 + rowind, j + colind).Interior.Color = RGB(112, 48, 160)
newSheet.Cells(i - 1 + rowind, j + colind).Font.Color = RGB(255, 255, 255)
Else
newSheet.Cells(i + rowind, j + colind) = dset.fields(j).Value
End If
newSheet.Cells(i + rowind, j + colind).EntireColumn.AutoFit
newSheet.Cells(i + rowind, j + colind).Borders.LineStyle = xlContinuous
Next j
If i > 0 Then
dset.MoveNext
End If
Next i
End Sub

Private Function GetTitle(ID As String) As String
    Dim Values As Range
    Set Values = Columns(1)
    Set Values2 = Columns(2)
    For i = 1000 To Values2.Cells.Count - 1
        If Values2.Cells(i).Text = "" Or Values2.Cells(i).Text = ID Then
        GetTitle = Values.Cells(i).Text
        Exit For
        Exit Function
        End If
    Next
End Function

Sub DicInit()
Dim tbs As String
tbs = ""
Dim Values As Range
Set Values = Columns(1)
For i = 100 To Values.Cells.Count - 1
If Values.Cells(i).Text = "" Then
Exit For
End If
tbs = tbs & "'" & Values.Cells(i).Text & "',"
Next
i = 1000
Set cn = CreateObject("ADODB.Connection")
Set rs = CreateObject("ADODB.Recordset")
cn.ConnectionString = "Provider=OraOLEDB.Oracle;Data Source=swak;User ID=DDHBM2;Password=DDHBM2;"
cn.Open
rs.Open "select upper(SFIELDID), SFIELDNAME  from tbltabledef where stableid in (" & tbs & "'nothing')", cn
Do Until rs.EOF
Cells(i, 1) = rs.fields(1).Value
Cells(i, 2) = rs.fields(0).Value
rs.MoveNext
i = i + 1
Loop
'オブジェクトのクローズ
rs.Close
cn.Close
'オブジェクトの開放
Set rs = Nothing
Set cn = Nothing
End Sub

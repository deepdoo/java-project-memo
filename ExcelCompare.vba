For i = 1 To 65535
For j = 1 To 65535

Worksheets(2).Cells(i, j).ClearComments

If Trim(Worksheets(2).Cells(i, j).Text) <> Trim(Worksheets(1).Cells(i, j).Text) Then

Worksheets(2).Cells(i, j).Interior.ColorIndex = 6
Worksheets(2).Cells(i, j).AddComment (Worksheets(1).Cells(i, j).Text)
Else

Worksheets(2).Cells(i, j).Interior.ColorIndex = Worksheets(1).Cells(i, j).Interior.ColorIndex
End If

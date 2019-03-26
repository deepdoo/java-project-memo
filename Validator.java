
	/**
	 * <PRE>
	 * 半角カナチェックを行います。
	 * </PRE>
	 *
	 * @param param チェック対象文字列
	 * @return boolean 全て半角カナならtrue
	 */
	private static boolean isAllHalf(String param) {
		char[] chs = param.toCharArray();

		for (int i = 0; i < chs.length; i++) {
			if (!(('\uFF61' <= chs[i]) && (chs[i] <= '\uFF9F')) && !(('\u0020' <= chs[i]) && (chs[i] <= '\u007E'))) {
				return false;
			}
		}

		return true;
	}
}

	/**
	 * <PRE>
	 * src を文字列に変換し、長さ len になるまで右に空白１個を連続的に埋め込みます。
	 * <br>
	 * str の長さが len に満たない場合、len に収まるように
	 * str の一部を戻します。<br>
	 * len に負数を指定した場合は、エラーとなり、null を戻します。<br>
	 * </PRE>
	 *
	 * @param   src  数値
	 * @param   len  最終的な文字列の長さ（文字数）
	 * @return  変換後の文字列
	 */
	public static String rpad(int src, int len) {
		String str = new String(String.valueOf(src));
		return rpad(str, len, ' ');
	}

	/**
	 * <PRE>
	 * src を文字列に変換し、長さ len になるまで右に ch を連続的に埋め込みます。
	 * <br>
	 * str の長さが len に満たない場合、len に収まるように
	 * str の一部を戻します。<br>
	 * </PRE>
	 *
	 * @param   src  数値
	 * @param   len  最終的な文字列の長さ（文字数）
	 * @param   ch   埋め込む文字
	 * @return  変換後の文字列
	 */
	public static String rpad(int src, int len, char ch) {
		String str = new String(String.valueOf(src));
		return rpad(str, len, ch);
	}

	/**
	 * <PRE>
	 * str の右に空白１個を連続的に埋め込んで、長さ len にして戻します。
	 * <br>
	 * str の長さが len に満たない場合、len に収まるように
	 * str の一部を戻します。<br>
	 * len に負数を指定した場合は、エラーとなり、null を戻します。<br>
	 * </PRE>
	 *
	 * @param   str  元の文字列
	 * @param   len  最終的な文字列の長さ（文字数）
	 * @return  変換後の文字列
	 */
	public static String rpad(String str, int len) {
		return rpad(str, len, ' ');
	}

	/**
	 * <PRE>
	 * str の右に ch を連続的に埋め込んで、長さ len にして戻します。
	 * <br>
	 * str の長さが len に満たない場合、len に収まるように
	 * str の一部を戻します。<br>
	 * len に負数を指定した場合は、エラーとなり、null を戻します。<br>
	 * </PRE>
	 *
	 * @param   str  元の文字列
	 * @param   len  最終的な文字列の長さ（文字数）
	 * @param   ch   埋め込む文字
	 * @return  変換後の文字列
	 */
	public static String rpad(String str, int len, char ch) {
		return (___padding(str, len, ch, true));
	}

	/**
	 * <PRE>
	 * src を文字列に変換し、長さ len になるまで左に空白１個を連続的に埋め込みます。
	 * <br>
	 * str の長さが len に満たない場合、len に収まるように
	 * str の一部を戻します。<br>
	 * len に負数を指定した場合は、エラーとなり、null を戻します。<br>
	 * </PRE>
	 *
	 * @param   src  元の文字列
	 * @param   len  最終的な文字列の長さ（文字数）
	 * @return  変換後の文字列
	 */
	public static String lpad(int src, int len) {
		String str = new String(String.valueOf(src));
		return lpad(str, len, ' ');
	}

	/**
	 * <PRE>
	 * src を文字列に変換し、長さ len になるまで左に ch を連続的に埋め込みます。
	 * <br>
	 * str の長さが len に満たない場合、len に収まるように
	 * str の一部を戻します。<br>
	 * len に負数を指定した場合は、エラーとなり、null を戻します。<br>
	 * </PRE>
	 *
	 * @param   src  元の文字列
	 * @param   len  最終的な文字列の長さ（文字数）
	 * @param   ch   埋め込む文字
	 * @return  変換後の文字列
	 */
	public static String lpad(int src, int len, char ch) {
		String str = new String(String.valueOf(src));
		return lpad(str, len, ch);
	}

	/**
	 * <PRE>
	 * str の左に空白１個を連続的に埋め込んで、長さ len にして戻します。
	 * <br>
	 * str の長さが len に満たない場合、len に収まるように
	 * str の一部を戻します。<br>
	 * len に負数を指定した場合は、エラーとなり、null を戻します。<br>
	 * </PRE>
	 *
	 * @param   str  元の文字列
	 * @param   len  最終的な文字列の長さ（文字数）
	 * @return  変換後の文字列
	 */
	public static String lpad(String str, int len) {
		return lpad(str, len, ' ');
	}

	/**
	 * <PRE>
	 * str の左に ch を連続的に埋め込んで、長さ len にして戻します。
	 * <br>
	 * str の長さが len に満たない場合、len に収まるように
	 * str の一部を戻します。<br>
	 * len に負数を指定した場合は、エラーとなり、null を戻します。<br>
	 * </PRE>
	 *
	 * @param   str  元の文字列
	 * @param   len  最終的な文字列の長さ（文字数）
	 * @param   ch   埋め込む文字
	 * @return  変換後の文字列
	 */
	public static String lpad(String str, int len, char ch) {
		return (___padding(str, len, ch, false));
	}


	/**
	 * <PRE>
	 * lpad, rpad が内部で呼び出すメソッド。
	 * 処理本体でもある。
	 * </PRE>
	 *
	 * @param   str  元の文字列
	 * @param   len  最終的な文字列の長さ（文字数）
	 * @param   ch   埋め込む文字
	 * @param   flg  true = 右詰め, false = 左詰め
	 * @return  変換後の文字列
	 */
	private static String ___padding(String str, int len, char ch, boolean flg) {

		if ((str == null) || (len < 0)) {
			// str が null か、len が負数ならば、エラー
			return (null);
		}

		/** 元の文字列の文字数 */
		int srclen = str.length();

		if (srclen == len) {
			// str.length() = len の場合（str をそのまま返す）
			return (str);
		}
		else if (srclen < len) {
			// str.length() < len の場合（str の右に埋め込む）
			StringBuffer sb = new StringBuffer(str);

			/** 足りない文字数 */
			int n = len - srclen;
			if (flg) { // 右詰め
				for (int i = 0; i < n; i++)
					sb.append(ch);
			}
			else {     // 左詰め
				for (int i = 0; i < n; i++)
					sb.insert(0, ch);
			}
			return (sb.toString());
		}
		else {
			// str.length() > len の場合（str を切り詰め）
			return (str.substring(0, len));
		}
	}

	/**
	 * <PRE>
	 * 小数形式の文字列から末尾の0及び小数点を取り除く
	 * 
	 * </PRE>
	 *
	 * @param   instr  元の文字列
	 * @return  変換後の文字列
	 */
	public static String trimDecimalChar(String instr) {
		String outStr = null;
		if(instr.indexOf(".") > 0){
			char ch = instr.charAt(instr.length() -1);
				
			if('0' == ch){
				outStr = trimDecimalChar(instr.substring(0,instr.length() -1));
			}else if('.' == ch){
				outStr = instr.substring(0,instr.length() -1);
			}else{
				outStr = instr;
			}
		}else{
			outStr = instr;
		}
		return outStr;
	}
	

/**
 * 半角全角コンバータ
 */

	/** Windows かの判定結果 */
	private static boolean _windows = System.getProperty("os.name").startsWith("Win");

	/** SJIS かの判定結果 */
	private static boolean _sjis    = System.getProperty("file.encoding").equals("SJIS");

	/** 日本語環境かの判定結果 */
	private static boolean _ja      = System.getProperty("user.language").equals("ja");


	/**
	 * <PRE>
	 * 半角カタカナかどうかを調べる
	 * </PRE>
	 *
	 * @param c 文字
	 * @return 半角カタカナであれば true
	 */
	public static boolean isHanKana(char c) {
		return ((c > 0xff60) && (c <= 0xff9f));
	}


	/**
	 * <PRE>
	 * 全角カタカナかどうかを調べる
	 * </PRE>
	 *
	 * @param c 文字
	 * @return 全角カタカナであれば true
	 */
	public static boolean isZenKataKana(char c) {
		return ((c > 0x30a0) && (c <= 0x30f4));
	}


	/**
	 * <PRE>
	 * 全角ひらがなかどうかを調べる
	 * </PRE>
	 *
	 * @param c 文字
	 * @return 全角ひらがなであれば true
	 */
	public static boolean isZenHiraKana(char c) {
		return ((c > 0x3040) && (c <= 0x3094));
	}


	/**
	 * <PRE>
	 * 全角ひらがな、もしくは全角カタカナかどうかを調べる
	 * </PRE>
	 *
	 * @param c 文字
	 * @return 全角であれば true
	 */
	public static boolean isZenKana(char c) {
		return (isZenKataKana(c) ||
		        isZenHiraKana(c) ||
		        (c == 0x3001) ||
		        (c == 0x3002) ||
		        (c == 0x3094) ||
		        ((c >= 0x309b) && (c <=0x309e)) ||
		        ((c >= 0x30f4) && (c <=0x30f6)) ||
		        ((c >= 0x30fb) && (c <=0x30fe))
		       ); 
	}


	/**
	 * <PRE>
	 * 半角ASCII文字かどうかを調べる
	 * </PRE>
	 *
	 * @param c 文字
	 * @return 半角ASCIIであれば true
	 */
	public static boolean isHanAscii(char c) {
		return ((c < 0x007f) && (c >= 0x0020));
	}


	/**
	 * <PRE>
	 * 全角ASCII文字かどうかを調べる
	 * </PRE>
	 *
	 * @param c 文字
	 * @return 全角ASCIIであれば true
	 */
	public static boolean isZenAscii(char c) {
		return (((c > 0xff00) && (c <= 0xff5e)) ||
		        (c == 0x2032) ||
		        (c == 0x2033) ||
		        (c == 0x3000) ||
		        (c == 0x301c)
		       );
	}


	/**
	 * <PRE>
	 * 機種(OS)依存文字かどうかを調べる。<br>
	 * 機種(OS)依存文字であればtrueを返す。<br>
	 * ここで機種(OS)依存文字とは、<br>
	 * 13区のNEC特殊文字の中で、2区に同じ文字があるものを除いたものを指す。<br>
	 * </PRE>
	 * 
	 * @param c char 文字
	 * @return boolean
	 */
	public static boolean isCharDependOnOS(char c) {
		if(((c <= 0x2473) && (c >= 0x2460)) || // ①～⑳
		   ((c <= 0x2169) && (c >= 0x2160)) || // Ⅰ～Ⅹ
		   ((c <= 0x32a8) && (c >= 0x32a4)) || // ㊤㊥㊦㊧㊨
		   ((c <= 0x337e) && (c >= 0x337b)) || // ㍻㍼㍽㍾
		   ((c <= 0x339e) && (c >= 0x339c)) || // ㎜㎝㎞
		    (c == 0x2121) || (c == 0x2116) ||  // ℡№
		    (c == 0x222e) || (c == 0x2211) ||  // ∮∑
		    (c == 0x22bf) || (c == 0x221f) ||  // ⊿∟
		    (c == 0x33a1) || (c == 0x3231) ||  // ㎡㈱
		    (c == 0x338e) || (c == 0x33c4) ||  // ㎎㏄
		    (c == 0x338f) || (c == 0x3322) ||  // ㎏㌢
		    (c == 0x3349) || (c == 0x3314) ||  // ㍉㌔
		    (c == 0x3327) || (c == 0x334d) ||  // ㌧㍍
		    (c == 0x3303) || (c == 0x3318) ||  // ㌃㌘
		    (c == 0x3336) || (c == 0x332b) ||  // ㌶㌫
		    (c == 0x3351) || (c == 0x334a) ||  // ㍑㍊
		    (c == 0x3357) || (c == 0x333b) ||  // ㍗㌻
		    (c == 0x330d) || (c == 0x301d) ||  // ㌍〝
		    (c == 0x3326) || (c == 0x301f) ||  // ㌦〟
		    (c == 0x3323) || (c == 0x33cd) ||  // ㌣㏍
		    (c == 0x3232) || (c == 0x3239)     // ㈲㈹
		   ) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * <PRE>
	 * 機種(OS)依存文字を削除する。<br>
	 * ここで機種(OS)依存文字とは、<br>
	 * 13区のNEC特殊文字の中で、2区に同じ文字があるものを除いたものを指す。<br>
	 * </PRE>
	 * 
	 * @param c char 文字
	 * @return char
	 */
	public static String removeCharDependOnOS(char c) {
		if(isCharDependOnOS(c)) {
			return "";
		}
		return String.valueOf(c);
	}


	/**
	 * <PRE>
	 * 全角ひらがなを全角カタカナに変換する。
	 * 指定された文字が全角ひらがなでない場合は、
	 * 変換せずに文字を返す。
	 * </PRE>
	 *
	 * @param c 変換する文字
	 * @return 変換後の文字
	 */
	public static char zenHiraToZenKata(char c) {
		return (isZenHiraKana(c) ? (char)(c + 0x60) : c);
	}


	/**
	 * <PRE>
	 * 全角カタカナを全角ひらがなに変換する。
	 * 指定された文字が全角カタカナでない場合は、
	 * 変換せずに文字を返す。
	 * </PRE>
	 *
	 * @param c 変換する文字
	 * @return 変換後の文字
	 */
	public static char zenKataToZenHira(char c) {
		return (isZenKataKana(c) ? (char)(c - 0x60) : c);
	}


	/**
	 * <PRE>
	 * 文字列中の半角文字を全角文字に変換する。<br>
	 * 変換できない文字はそのままにして返す。
	 * </PRE>
	 *
	 * @param s 変換する文字列
	 * @return  変換後の文字列
	 */
	public static String toZenkaku(String s) {
		if ((s == null) || (s.length() <= 0))
			return (s);
		StringCharacterIterator iter = new StringCharacterIterator(s);
		StringBuffer buf = new StringBuffer(s.length());
		for (char c = iter.first(); c != CharacterIterator.DONE; c = iter.next()) {
			buf.append(toZenkaku(c,iter));
		}
		return (buf.toString());
	}

	/**
	 * <PRE>
	 * 文字列中の半角カタカナを全角カタカナに変換する。<br>
	 * </PRE>
	 *
	 * @param s 変換する文字列
	 * @return  変換後の文字列
	 */
	public static String toZenkakuKana(String s) {
		if ((s == null) || (s.length() <= 0))
			return (s);
		StringCharacterIterator iter = new StringCharacterIterator(s);
		StringBuffer buf = new StringBuffer(s.length());
		for (char c = iter.first(); c != CharacterIterator.DONE; c = iter.next()) {
			buf.append(toZenkakuKana(c,iter));
		}
		return (buf.toString());
	}
	
	/**
	 * <PRE>
	 * 文字列中の全角カタカナを半角カタカナに変換する。<br>
	 * 全角カタカナ以外の文字はそのままにして返す。
	 * </PRE>
	 *
	 * @param s 変換する文字列
	 * @return  変換後の文字列
	 */
	public static String toHankakuKana(String s) {
		if ((s == null) || (s.length() <= 0))
			return (s);
		StringCharacterIterator iter = new StringCharacterIterator(s);
		StringBuffer buf = new StringBuffer(s.length());
		for (char c = iter.first(); c != CharacterIterator.DONE; c = iter.next()) {
			/* 全角カタカナであった場合 */
			if(isZenKataKana(c)) {
				buf.append(toHankaku(c));
			} else {
				buf.append(c);
			}
		}
		return (buf.toString());
	}
	
	/**
	 * <PRE>
	 * 文字列中の全角文字を半角文字に変換する。<br>
	 * 全角ひらがなは半角カタカナに変換。<br>
	 * 変換できない文字（漢字など）はそのままにして返す。
	 * </PRE>
	 *
	 * @param s 変換する文字列
	 * @return  変換後の文字列
	 */
	public static String toHankaku(String s) {
		if ((s == null) || (s.length() <= 0))
			return (s);
		StringCharacterIterator iter = new StringCharacterIterator(s);
		StringBuffer buf = new StringBuffer(s.length());
		for (char c = iter.first(); c != CharacterIterator.DONE; c = iter.next()) {
			buf.append(toHankaku(c));
		}
		return (buf.toString());
	}
	
	/**
	 * <PRE>
	 * 文字列中の全角文字を半角文字に変換する。<br>
	 * 全角ひらがなは半角カタカナに変換。<br>
	 * 変換できない文字（漢字など）はそのままにして返す。
	 * </PRE>
	 *
	 * @param s 変換する文字列
	 * @return  変換後の文字列
	 */
	public static String toHankakuRPspace(String s) {
		if ((s == null) || (s.length() <= 0))
			return (s);
		StringCharacterIterator iter = new StringCharacterIterator(s);
		StringBuffer buf = new StringBuffer(s.length());
		for (char c = iter.first(); c != CharacterIterator.DONE; c = iter.next()) {
			buf.append(toHankaku(c, ' '));
		}
		return (buf.toString());
	}


	/** 
	 * <PRE>
	 * 全角文字を半角文字に変換する
	 * </PRE>
	 */
	private static char[] toHankaku(char c) {
		return toHankaku(c, c);
	}
	
	/** 
	 * <PRE>
	 * 全角文字を半角文字に変換する
	 * </PRE>
	 */
	private static char[] toHankaku(char c, char rpch) {
		if (hashZen2Han == null) {
			init();
		}
		char[] ch = (char[])hashZen2Han.get(new Character(zenHiraToZenKata(c)));
		return  ((ch != null) ? ch : new char[]{rpch});
	}




	/** 
	 * <PRE>
	 * 半角文字を全角文字に変換する
	 * </PRE>
	 */
	private static char toZenkaku(char c, CharacterIterator iter) {
		if (isHanAscii(c)) {
			return (tblZenkaku[(int)c - 0x20]);
		}
		else if (isHanKana(c)) {
			char next = iter.next();
			if ((next == CharacterIterator.DONE) ||
			    !((next == 0xff9e) || (next == 0xff9f))) {
				iter.previous();
				return (tblZenkaku[(int)c - 0xff61 + 0x5f]);
			}
			else {
				for (int i = 158; i < tblHankaku.length; i++) {
					if ((c == tblHankaku[i][0]) && (next == tblHankaku[i][1])) {
						return tblZenkaku[i];
					}
				}
				iter.previous();
				return (tblZenkaku[(int)c - 0xff61 + 0x5f]);
			}
		}
		return (c);
	}

	/** 
	 * <PRE>
	 * 半角カタカナを全角カタカナに変換する
	 * </PRE>
	 */
	private static char toZenkakuKana(char c, CharacterIterator iter) {
		if (isHanKana(c)) {
			char next = iter.next();
			if ((next == CharacterIterator.DONE) ||
			    !((next == 0xff9e) || (next == 0xff9f))) {
				iter.previous();
				return (tblZenkaku[(int)c - 0xff61 + 0x5f]);
			}
			else {
				for (int i = 158; i < tblHankaku.length; i++) {
					if ((c == tblHankaku[i][0]) && (next == tblHankaku[i][1])) {
						return tblZenkaku[i];
					}
				}
				iter.previous();
				return (tblZenkaku[(int)c - 0xff61 + 0x5f]);
			}
		}
		return (c);
	}


	/** 全角文字をキー、対応する半角文字を値とするハッシュテーブル */
	public static Hashtable hashZen2Han = null;
	
	/**
	 * <PRE>
	 * 初期化メソッド。メソッド toHan() からコールされる。
	 * 初めてコールされたときにハッシュテーブルを作成する。
	 * </PRE>
	 *
	 * @param  なし
	 * @return なし
	 */
	public static void init() {
		if (hashZen2Han != null)
			return;
		hashZen2Han = new Hashtable(300);
		if (!(_sjis || _windows)) {
			tblZenkaku[55] = 0xff3c; // UNIXはバックスラッシュ
		}
		for (int i = 0; i < tblHankaku.length; i++) {
			hashZen2Han.put(new Character(tblZenkaku[i]), tblHankaku[i]);
		}
	}


	/*
	 * 以下、半角と全角文字のテーブル定義。半角－全角の対応は、配列内で同じ位置
	 * にあるものでマッピングする。
	 */
	/** 半角文字テーブル */
	private static char[][] tblHankaku = {
		{0x0020} ,//
		{0x0021} ,// !
		{0x0022} ,// "
		{0x0023} ,// #
		{0x0024} ,// $
		{0x0025} ,// %
		{0x0026} ,// &
		{0x0027} ,// '
		{0x0028} ,// (
		{0x0029} ,// )
		{0x002a} ,// *
		{0x002b} ,// +
		{0x002c} ,// ,
		{0x002d} ,// -
		{0x002e} ,// .
		{0x002f} ,// /
		{0x0030} ,// 0
		{0x0031} ,// 1
		{0x0032} ,// 2
		{0x0033} ,// 3
		{0x0034} ,// 4
		{0x0035} ,// 5
		{0x0036} ,// 6
		{0x0037} ,// 7
		{0x0038} ,// 8
		{0x0039} ,// 9
		{0x003a} ,// :
		{0x003b} ,// ;
		{0x003c} ,// <
		{0x003d} ,// =
		{0x003e} ,// >
		{0x003f} ,// ?
		{0x0040} ,// @
		{0x0041} ,// A
		{0x0042} ,// B
		{0x0043} ,// C
		{0x0044} ,// D
		{0x0045} ,// E
		{0x0046} ,// F
		{0x0047} ,// G
		{0x0048} ,// H
		{0x0049} ,// I
		{0x004a} ,// J
		{0x004b} ,// K
		{0x004c} ,// L
		{0x004d} ,// M
		{0x004e} ,// N
		{0x004f} ,// O
		{0x0050} ,// P
		{0x0051} ,// Q
		{0x0052} ,// R
		{0x0053} ,// S
		{0x0054} ,// T
		{0x0055} ,// U
		{0x0056} ,// V
		{0x0057} ,// W
		{0x0058} ,// X
		{0x0059} ,// Y
		{0x005a} ,// Z
		{0x005b} ,// [
		{0x005c} ,// \
		{0x005d} ,// ]
		{0x005e} ,// ^
		{0x005f} ,// _
		{0x0060} ,// `
		{0x0061} ,// a
		{0x0062} ,// b
		{0x0063} ,// c
		{0x0064} ,// d
		{0x0065} ,// e
		{0x0066} ,// f
		{0x0067} ,// g
		{0x0068} ,// h
		{0x0069} ,// i
		{0x006a} ,// j
		{0x006b} ,// k
		{0x006c} ,// l
		{0x006d} ,// m
		{0x006e} ,// n
		{0x006f} ,// o
		{0x0070} ,// p
		{0x0071} ,// q
		{0x0072} ,// r
		{0x0073} ,// s
		{0x0074} ,// t
		{0x0075} ,// u
		{0x0076} ,// v
		{0x0077} ,// w
		{0x0078} ,// x
		{0x0079} ,// y
		{0x007a} ,// z
		{0x007b} ,// {
		{0x007c} ,// |
		{0x007d} ,// }
		{0x007e} ,// ~
		{0xff61} ,// ｡
		{0xff62} ,// ｢
		{0xff63} ,// ｣
		{0xff64} ,// ､
		{0xff65} ,// ･
		{0xff66} ,// ｦ
		{0xff67} ,// ｧ
		{0xff68} ,// ｨ
		{0xff69} ,// ｩ
		{0xff6a} ,// ｪ
		{0xff6b} ,// ｫ
		{0xff6c} ,// ｬ
		{0xff6d} ,// ｭ
		{0xff6e} ,// ｮ
		{0xff6f} ,// ｯ
		{0xff70} ,// ｰ
		{0xff71} ,// ｱ
		{0xff72} ,// ｲ
		{0xff73} ,// ｳ
		{0xff74} ,// ｴ
		{0xff75} ,// ｵ
		{0xff76} ,// ｶ
		{0xff77} ,// ｷ
		{0xff78} ,// ｸ
		{0xff79} ,// ｹ
		{0xff7a} ,// ｺ
		{0xff7b} ,// ｻ
		{0xff7c} ,// ｼ
		{0xff7d} ,// ｽ
		{0xff7e} ,// ｾ
		{0xff7f} ,// ｿ
		{0xff80} ,// ﾀ
		{0xff81} ,// ﾁ
		{0xff82} ,// ﾂ
		{0xff83} ,// ﾃ
		{0xff84} ,// ﾄ
		{0xff85} ,// ﾅ
		{0xff86} ,// ﾆ
		{0xff87} ,// ﾇ
		{0xff88} ,// ﾈ
		{0xff89} ,// ﾉ
		{0xff8a} ,// ﾊ
		{0xff8b} ,// ﾋ
		{0xff8c} ,// ﾌ
		{0xff8d} ,// ﾍ
		{0xff8e} ,// ﾎ
		{0xff8f} ,// ﾏ
		{0xff90} ,// ﾐ
		{0xff91} ,// ﾑ
		{0xff92} ,// ﾒ
		{0xff93} ,// ﾓ
		{0xff94} ,// ﾔ
		{0xff95} ,// ﾕ
		{0xff96} ,// ﾖ
		{0xff97} ,// ﾗ
		{0xff98} ,// ﾘ
		{0xff99} ,// ﾙ
		{0xff9a} ,// ﾚ
		{0xff9b} ,// ﾛ
		{0xff9c} ,// ﾜ
		{0xff9d} ,// ﾝ
		{0xff9e} ,// ﾞ
		{0xff9f} ,// ﾟ
		////
		{0xff76, 0xff9e} ,// ｶﾞ
		{0xff77, 0xff9e} ,// ｷﾞ
		{0xff78, 0xff9e} ,// ｸﾞ
		{0xff79, 0xff9e} ,// ｹﾞ
		{0xff7a, 0xff9e} ,// ｺﾞ
		{0xff7b, 0xff9e} ,// ｻﾞ
		{0xff7c, 0xff9e} ,// ｼﾞ
		{0xff7d, 0xff9e} ,// ｽﾞ
		{0xff7e, 0xff9e} ,// ｾﾞ
		{0xff7f, 0xff9e} ,// ｿﾞ
		{0xff80, 0xff9e} ,// ﾀﾞ
		{0xff81, 0xff9e} ,// ﾁﾞ
		{0xff82, 0xff9e} ,// ﾂﾞ
		{0xff83, 0xff9e} ,// ﾃﾞ
		{0xff84, 0xff9e} ,// ﾄﾞ
		{0xff8a, 0xff9e} ,// ﾊﾞ
		{0xff8b, 0xff9e} ,// ﾋﾞ
		{0xff8c, 0xff9e} ,// ﾌﾞ
		{0xff8d, 0xff9e} ,// ﾍﾞ
		{0xff8e, 0xff9e} ,// ﾎﾞ
		{0xff8a, 0xff9f} ,// ﾊﾟ
		{0xff8b, 0xff9f} ,// ﾋﾟ
		{0xff8c, 0xff9f} ,// ﾌﾟ
		{0xff8d, 0xff9f} ,// ﾍﾟ
		{0xff8e, 0xff9f} ,// ﾎﾟ
	};


	/** 全角文字テーブル */
	private static char[] tblZenkaku = {
		0x3000 ,// 　
		0xff01 ,// ！
		0x2033 ,// ″
		0xff03 ,// ＃
		0xff04 ,// ＄
		0xff05 ,// ％
		0xff06 ,// ＆
		0x2032 ,// ′
		0xff08 ,// （
		0xff09 ,// ）
		0xff0a ,// ＊
		0xff0b ,// ＋
		0xff0c ,// ，
		0xff0d ,// －
		0xff0e ,// ．
		0xff0f ,// ／
		0xff10 ,// ０
		0xff11 ,// １
		0xff12 ,// ２
		0xff13 ,// ３
		0xff14 ,// ４
		0xff15 ,// ５
		0xff16 ,// ６
		0xff17 ,// ７
		0xff18 ,// ８
		0xff19 ,// ９
		0xff1a ,// ：
		0xff1b ,// ；
		0xff1c ,// ＜
		0xff1d ,// ＝
		0xff1e ,// ＞
		0xff1f ,// ？
		0xff20 ,// ＠
		0xff21 ,// Ａ
		0xff22 ,// Ｂ
		0xff23 ,// Ｃ
		0xff24 ,// Ｄ
		0xff25 ,// Ｅ
		0xff26 ,// Ｆ
		0xff27 ,// Ｇ
		0xff28 ,// Ｈ
		0xff29 ,// Ｉ
		0xff2a ,// Ｊ
		0xff2b ,// Ｋ
		0xff2c ,// Ｌ
		0xff2d ,// Ｍ
		0xff2e ,// Ｎ
		0xff2f ,// Ｏ
		0xff30 ,// Ｐ
		0xff31 ,// Ｑ
		0xff32 ,// Ｒ
		0xff33 ,// Ｓ
		0xff34 ,// Ｔ
		0xff35 ,// Ｕ
		0xff36 ,// Ｖ
		0xff37 ,// Ｗ
		0xff38 ,// Ｘ
		0xff39 ,// Ｙ
		0xff3a ,// Ｚ
		0xff3b ,// ［
		0xffe5, // ￥
		0xff3d ,// ］
		0xff3e ,// ＾
		0xff3f ,// ＿
		0xff40 ,// ｀
		0xff41 ,// ａ
		0xff42 ,// ｂ
		0xff43 ,// ｃ
		0xff44 ,// ｄ
		0xff45 ,// ｅ
		0xff46 ,// ｆ
		0xff47 ,// ｇ
		0xff48 ,// ｈ
		0xff49 ,// ｉ
		0xff4a ,// ｊ
		0xff4b ,// ｋ
		0xff4c ,// ｌ
		0xff4d ,// ｍ
		0xff4e ,// ｎ
		0xff4f ,// ｏ
		0xff50 ,// ｐ
		0xff51 ,// ｑ
		0xff52 ,// ｒ
		0xff53 ,// ｓ
		0xff54 ,// ｔ
		0xff55 ,// ｕ
		0xff56 ,// ｖ
		0xff57 ,// ｗ
		0xff58 ,// ｘ
		0xff59 ,// ｙ
		0xff5a ,// ｚ
		0xff5b ,// ｛
		0xff5c ,// ｜
		0xff5d ,// ｝
		//0xff5e ,// ～
		0xffe3 ,// ￣
		0x3002 ,// 。
		0x300c ,// 「
		0x300d ,// 」
		0x3001 ,// 、
		0x30fb ,// ・
		0x30f2 ,// ヲ
		0x30a1 ,// ァ
		0x30a3 ,// ィ
		0x30a5 ,// ゥ
		0x30a7 ,// ェ
		0x30a9 ,// ォ
		0x30e3 ,// ャ
		0x30e5 ,// ュ
		0x30e7 ,// ョ
		0x30c3 ,// ッ
		0x30fc ,// ー
		0x30a2 ,// ア
		0x30a4 ,// イ
		0x30a6 ,// ウ
		0x30a8 ,// エ
		0x30aa ,// オ
		0x30ab ,// カ
		0x30ad ,// キ
		0x30af ,// ク
		0x30b1 ,// ケ
		0x30b3 ,// コ
		0x30b5 ,// サ
		0x30b7 ,// シ
		0x30b9 ,// ス
		0x30bb ,// セ
		0x30bd ,// ソ
		0x30bf ,// タ
		0x30c1 ,// チ
		0x30c4 ,// ツ
		0x30c6 ,// テ
		0x30c8 ,// ト
		0x30ca ,// ナ
		0x30cb ,// ニ
		0x30cc ,// ヌ
		0x30cd ,// ネ
		0x30ce ,// ノ
		0x30cf ,// ハ
		0x30d2 ,// ヒ
		0x30d5 ,// フ
		0x30d8 ,// ヘ
		0x30db ,// ホ
		0x30de ,// マ
		0x30df ,// ミ
		0x30e0 ,// ム
		0x30e1 ,// メ
		0x30e2 ,// モ
		0x30e4 ,// ヤ
		0x30e6 ,// ユ
		0x30e8 ,// ヨ
		0x30e9 ,// ラ
		0x30ea ,// リ
		0x30eb ,// ル
		0x30ec ,// レ
		0x30ed ,// ロ
		0x30ef ,// ワ
		0x30f3 ,// ン
		0x309b ,// ゛
		0x309c ,// ゜
		////
		0x30ac ,// ガ
		0x30ae ,// ギ
		0x30b0 ,// グ
		0x30b2 ,// ゲ
		0x30b4 ,// ゴ
		0x30b6 ,// ザ
		0x30b8 ,// ジ
		0x30ba ,// ズ
		0x30bc ,// ゼ
		0x30be ,// ゾ
		0x30c0 ,// ダ
		0x30c2 ,// ヂ
		0x30c5 ,// ヅ
		0x30c7 ,// デ
		0x30c9 ,// ド
		0x30d0 ,// バ
		0x30d3 ,// ビ
		0x30d6 ,// ブ
		0x30d9 ,// ベ
		0x30dc ,// ボ
		0x30d1 ,// パ
		0x30d4 ,// ピ
		0x30d7 ,// プ
		0x30da ,// ペ
		0x30dd ,// ポ
	};
	
	/**
	 * <PRE>
	 * long 引数の文字列表現を返します。ただし、nullの場合は空文字列""を返します。
	 * この表現は 1 つの引数を持つ Long.toString メソッドによって返されるものとまったく同じです。 
	 * </PRE>
	 * 
	 * @param	l	Long
	 * @return	lがnullの場合は""、nullでなければLongの文字列表現を返します。
	 */
	public static String valueOf(Long l) {
		return (l == null) ? "" : String.valueOf(l);
	}
	
	/**
	 * <PRE>
	 * BigDecimal 引数の文字列表現を返します。ただし、nullの場合は空文字列""を返します。
	 * この表現は 1 つの引数を持つ BigDecimal.toString メソッドによって返されるものとまったく同じです。 
	 * </PRE>
	 * 
	 * @param	bd	BigDecimal
	 * @return	bdがnullの場合は""、nullでなければBigDecimalの文字列表現を返します。
	 */
	public static String valueOf(BigDecimal bd) {
		return (bd == null) ? "" : String.valueOf(bd);
	}
	
	/**
	 * <PRE>
	 * 引数の文字列をtrimして返却します。
	 * 
	 * 引数がNullの場合は、新しいStringオブジェクトを返却します。
	 * </PRE>
	 * 
	 * @param param 文字列
	 * @return String トリムされた文字列
	 */
	public static String trim(String param){
		if(param == null){
			return new String();
		}else{
			return param.trim();
		}
	}
    
    /**
     * <PRE>
     * YYYYMMDD もしくは YYYY/M/D 形式の日付を GregorianCalendar 型に正規化します。
     * </PRE>
     * 
     * @param  String
     * @return ParseException
     */ 
    public static GregorianCalendar normalizeDateString(String dateString) throws ParseException {
        GregorianCalendar cal = new GregorianCalendar();
        String format = (-1 == dateString.indexOf("/")) ? "yyyyMMdd" : "yyyy/M/d";
        cal.setTime(new SimpleDateFormat(format).parse(dateString));
        return  cal;
    }
	
	/**
	 * <PRE>
	 * 数値文字列をLong型に変換します。
	 * </PRE>
	 */
	public static Long toLongObj(String val) {

		if (val == null) {
			return null;
		}
		val = val.trim();

		// カンマ削除
		String noCommaNum = val.replaceAll("\\,", "");

		Long result;
		try {
			result = Long.valueOf(noCommaNum);
		} catch (NumberFormatException e) {
			return null;
		}

		return result;
	}

	/**
	 * <PRE>
	 * 数値文字列をBigDecimal型に変換します。
	 * </PRE>
	 */
	public static BigDecimal toBigDecimal(String val) {

		if (val == null) {
			return null;
		}
		val = val.trim();

		// カンマ削除
		String noCommaNum = val.replaceAll("\\,", "");

		BigDecimal result;
		try {
			result = new BigDecimal(noCommaNum);
		} catch (NumberFormatException e) {
			return null;
		}

		return result;
	}
	
    /**
     * <PRE>
     * 指定した文字列が null だったら空文字に変換し、
     * null でなければそのまま返却します。
     * </PRE>
     * 
     * @param  original String
     * @return String
     */ 
    public static String changeNull(String original) {
        return  (null == original) ? "" : original;
    }
    
    /**
     * <PRE>
     * 指定した文字列が null だったら代替文字列に変換し、
     * null でなければそのまま返却します。
     * </PRE>
     * 
     * @param  original String 検証文字列
     * @param  alternative String 代替文字列
     * @return String
     */ 
    public static String changeNull(String original, String alternative) {
        return  (null == original) ? Inf23BtValidationStringUtil.changeNull(alternative) : original;
    }
    
    /**
     * <PRE>
     * 指定した文字列が null または空文字列だったら代替文字列に変換し、
     * それ以外の場合はそのまま返却します。
     * </PRE>
     * 
     * @param  original String 検証文字列
     * @param  alternative String 代替文字列
     * @return String
     */ 
    public static String changeBlank(String original, String alternative) {
        return  ((null == original) || (original.equals(""))) ? Inf23BtValidationStringUtil.changeNull(alternative) : original;
    }
    
    /**
     * <PRE>
     * 指定した文字列が null あるいは空文字であればtrueを返却します。
     * </PRE>
     * 
     * @param  str String 検査対象文字列
     * @return boolean	（true：nullあるいは空文字列／false：値が入っている）
     */ 
    public static boolean empty(String str) {
    	return  ((null == str) || (str.trim().equals("")));
    }
    
    /**
     * <PRE>
     * 指定した文字配列内の全ての文字列について、どれかひとつでも null あるいは空文字であればtrueを返却します。
     * </PRE>
     * 
     * @param  str String[] 検査対象文字列配列
     * @return boolean	（true：どれかひとつでもnullあるいは空文字列／false：すべてに値が入っている）
     */ 
    public static boolean empty(String[] str) {
		for (int i = 0; i < str.length; i++) {
			if (empty(str[i])) {
				return true;
			}
		}
		return false;
    }

    /**
     * <PRE>
     * 指定した文字列が null 又は 0 の場合、ブランクを返却します。
     * それ以外の場合は、文字列をそのまま返却します。
     * </PRE>
     * 
     * @param value 表示対象の項目
     * @return String 表示用の文字列
     */
    public static String changeZero(String value) {
        
        /* 表示対象：null 又は 0 */
        if ( "0".equals(value.trim()) || value == null) {

                return "";
       
        /* 表示対象：0以上の数値 */
        }
        return value;
    }

    /**
     * <PRE>
     * 小文字の英字があるかを調べます。
     * 次の文字が以外が許可されます。
     * ・全角英字（小文字）
     * ・半角英字（小文字）
     * </PRE>
     * 
     * @param value チェック対象の値
     * @return （全角小文字英字、半角小文字英字）がなければtrue
     */
    public static boolean isNotLowAlf(String value) {
        if (value == null) {
            return true;
        }
        for (int i = 0; i < value.length(); i++) {
            if (Character.isLowerCase(value.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * <PRE>
     * lineCounter
     * 入力されたStringの行数を返します。
     * </PRE>
     * 
     * @param String strVal
     * @param String String
     * @return サイズ
     */
    public static int lineCounter(String strVal,String checkVal) {

        List list = new ArrayList();

        while (true) {
            int pos = strVal.indexOf(checkVal);
            if (pos < 0) {
                break;
            }
            list.add(strVal.substring(0, pos + 1));
            strVal = strVal.substring(pos + 1);
        }

        return list.size();
    }

	/**
	 * <PRE>
	 * 文字列を指定長で切り取ったものを返却します。
	 * 指定長より短い場合、そのまま返却します。
	 * 引数として渡された文字列がnullの場合はnullを返却します。
	 * </PRE>
	 * 
	 * @param str 対象文字列
	 * @param length 指定長
	 * @return 返却文字列
	 * @exception IndexOutOfBoundsException
	 */
	public static String overCutString(String str, int length) throws IndexOutOfBoundsException {
		return (str == null) ? null : str.length() > length ? str.substring(0, length) : str;
	}
	
	/**
	 * <PRE>
	 * 引数で与えられたトリム対象文字列の前後半角全角スペースをすべて取り除いた文字列を返却します。
	 * トリム対象文字列がnull、空文字の場合そのまま返却します。
	 * トリム対象文字列が半角全角スペースのみの場合、空文字を返却します。
	 * </PRE>
	 * 
	 * @param str トリム対象文字列
	 * @return 結果文字列 
	 */
	public static String trimString(String str) {
		if (str != null && !"".equals(str)) {
			char harlWidthSpace = '\u0020';	// 半角スペース
			char fullWidthSpace = '\u3000';	// 全角スペース
			StringBuffer sb = new StringBuffer(str);
			
			/* 前方スペースの取り除き */
			while (sb.length() > 0 &&
				(sb.charAt(0) == harlWidthSpace ||
				 sb.charAt(0) == fullWidthSpace)) {
				sb.deleteCharAt(0);
			}

			/* 後方スペースの取り除き */
			while (sb.length() > 0 &&
				(sb.charAt(sb.length() - 1) == harlWidthSpace ||
				 sb.charAt(sb.length() - 1) == fullWidthSpace)) {
				sb.deleteCharAt(sb.length() - 1);
			}

			return (sb.length() == 0) ? "" : sb.toString();
		} else {
			return str;
		}
	}																																						

	/**
	 * <PRE>
	 * 指定した文字列のインデックス位置の文字が ch になるように設定します。
	 * ※indexは1から開始
	 * </PRE>
	 * 
	 * @param str - 変更対象の文字列
	 * @param index - 変更対象の文字列のインデックス(1から開始)
	 * @param ch - 新しい文字
	 * @exception index が負の値の場合、あるいは length() に等しいかこれより大きい場合
	 * @return 置換した文字列

	 */
	public static String setCharAt(String str, int index, char ch) throws IndexOutOfBoundsException {
		StringBuffer sb = new StringBuffer(str);
		sb.setCharAt(index - 1, ch);
		return sb.toString();
	}

	/**
	 * <PRE>
	 * 指定した文字列のインデックス位置の文字が ch になるように設定します。
	 * ※indexは1から開始
	 * </PRE>
	 * 
	 * @param str - 変更対象の文字列
	 * @param index - 変更対象の文字列のインデックス(1から開始)
	 * @param ch - 新しい文字(1文字目を使用)
	 * @exception index が負の値の場合、あるいは length() に等しいかこれより大きい場合
	 * @return 置換した文字列
	 */
	public static String setCharAt(String str, int index, String ch) throws IndexOutOfBoundsException {
		return setCharAt(str, index, ch.charAt(0));
	}

	/**
	 * <PRE>
	 * 指定した文字列の部分文字列の文字を、指定された String の文字に置換します。
	 * ※indexは1から開始
	 * </PRE>
	 * 
	 * @param str - 変更対象の文字列
	 * @param start - 変更対象の文字列の開始インデックス(この値を含む) (1から開始)
	 * @param end - 変更対象の文字列の終了インデックス(この値を含まない) (1から開始)
	 * @param repStr - 置換する文字列
	 * @exception start が負の値の場合、length() より大きい場合、あるいは end より大きい場合
	 * @return 置換した文字列
	 */
	public static String replace(String str, int start, int end, String repStr)
		throws StringIndexOutOfBoundsException  {
		StringBuffer sb = new StringBuffer(str);
		return sb.replace(start - 1, end - 1, repStr).toString();
	}

    /**
     * <PRE>
     * テンプレート文字列にパラメータを埋め込みます。
     * ※埋め込みパラメータより埋め込み対象文字列が少なかった場合、残りのパラメータは無視されます。
     * ※埋め込みパラメータより埋め込み対象文字列が多かった場合、足りない分はそのまま返却されます。
     * ※埋め込み対象文字列は "?" を使用します。
     * ※パラメータ:templateがnullの場合、nullが返却されます。
     * ※パラメータ:paramsがnullなら、テンプレート文字列をそのまま返却されます。
     * </PRE>
     *    
     * @param template - テンプレートとなる文字列
     * @param params - 埋め込むパラメータの文字列配列
     * @return 置き換えられた文字列
     */
    public static String replaceParams(String template, String[] params) {
    	return replaceParams(template, "?", params);
    }

    /**
     * <PRE>
     * テンプレート文字列にパラメータを埋め込みます。
     * ※埋め込みパラメータより埋め込み対象文字列が少なかった場合、残りのパラメータは無視されます。
     * ※埋め込みパラメータより埋め込み対象文字列が多かった場合、足りない分はそのまま返却されます。
     * ※パラメータ:templateがnullの場合、nullが返却されます。
     * ※パラメータ:repStrがnullか空文字なら、テンプレート文字列をそのまま返却されます。
     * ※パラメータ:paramsがnullなら、テンプレート文字列をそのまま返却されます。
     * </PRE>
     *    
     * @param template - テンプレートとなる文字列
     * @param repStr - パラメータ埋め込み対象となる文字列
     * @param params - 埋め込むパラメータの文字列配列
     * @return 置き換えられた文字列
     */
    public static String replaceParams(String template, String repStr, String[] params) {
    	/* パラメータ:templateがnullならnullを返却 */
    	if (template == null) {
    		return null;
    	}
    	/* パラメータ:repStrがnullなら空文字に変換 */
    	if (repStr == null || "".equals(repStr)) {
    		return template;
    	}
    	/* パラメータ:paramsがnullなら空の文字列配列に変換 */
    	if (params == null) {
    		params = new String[0];
    	}

    	StringBuffer sb = new StringBuffer(template);

    	/* パラメータ配列分繰り返し */
    	for (int i = 0, idx = 0;
    		i < params.length && (idx = sb.indexOf(repStr)) >= 0;
    		sb.replace(idx, idx	+ repStr.length(), params[i++])
    	);

    	return sb.toString();
    }

	/**
	 * <PRE>
	 * 渡された文字列をYYYY/MM/DD形式に変換します。
	 * </PRE>
	 * @return 変換後文字列
	 */
	public static String formatDate3(String str) {
		
		String retYmd = null;
		
		if(Inf23BtValidationStringUtil.empty(str)) {
			return "";
		}
		
		/* yyyymmdd形式のStringをyyyy/mm/dd形式のStringにフォーマットします */
		try {
			retYmd = (new SimpleDateFormat("yyyy/MM/dd")).format((new SimpleDateFormat("yyyyMMdd").parse(str)));
		} catch (java.text.ParseException e) {
			retYmd = "";
		}
		return retYmd;
	}
	
	/**
	 * <PRE>
	 * 文字列を指定したバイト数までの部分文字列を返却します。（String#subStringのバイト版）
	 * </PRE>
	 * @param str - 処理対象文字列
	 * @param beginIndexB - 開始インデックスバイト
	 * @param endIndexB - 終了インデックスバイト
	 */
	public static String subStringB(String str, int beginIndexB, int endIndexB) {
		
		/* インデックスの負はブランクを返却 */
		if (beginIndexB < 0 || endIndexB < 0) {
			return "";
		}
		
		/* 指定した文字列が null または ブランクはブランクを返却 */
		if (str == null || "".equals(str)) {
			return "";
		}
		
		/* 部分文字列を保持するバッファ */
		StringBuffer tmpStr = new StringBuffer();
		
		/* 現在のバイト数 */
		int tmpByte = 0;
		
		/* 文字列を1文字ずつ判断 */
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.toString(ch).getBytes().length == 1) {
				tmpByte += 1; // 半角は＋１
			} else {
				tmpByte += 2; // 全角は＋２
			}
			
			/* 終了インデックスバイトで終了 */
			if (tmpByte > endIndexB) {
				return tmpStr.toString();
			}
			
			/* 開始インデックスバイトからバッファに格納 */
			if (tmpByte > beginIndexB) {
				tmpStr.append(ch);
			}
		}
		
		return tmpStr.toString();
	}
	
	/**
	 * <PRE>
	 * 受け取ったchar型変数を１カウントアップして返却します。（英字限定）
	 * ※'A'の場合は'B'、'Z'の場合は'a'、'z'の場合は'A'を返却
	 * </PRE>
	 * @param ch - 処理対象文字
	 * @return 変換後文字
	 */
	public static char nextChr(char ch) {
		return ch == 'Z' ? 'a' : ch == 'z' ? 'A' : ++ch;
	}
	
	/**
	 * <PRE>
	 * 渡されたYYYYMMDD形式の文字列をDate型に変換します。
	 * </PRE>
	 * @param str - 処理対象文字(YYYYMMDD型）
	 * @return 変換後文字列
	 */
	public static Date changeDateFormat(String date){

		Date d;
		try {
			d = new SimpleDateFormat("yyyyMMdd").parse(date);
	
		} catch (ParseException e) {
			return null;
		}
	
		return d;
	}
	
	/**
	 * <PRE>
	 * 渡されたDate型をYYYYMMDD形式の文字列に変換します。
	 * </PRE>
	 * @param date - 処理対象日付
	 * @return 変換後文字列(YYYYMMDD型）
	 */
	public static String changeDateString(Date date){

		String result = "";
		String pattern = "YYYYMMDD";
		try {
			result = new SimpleDateFormat("yyyyMMdd").format(date);
	
		} catch (NumberFormatException e) {
			return result;
		}
	
		return result;
	}
	

	/**
	 * <pre>
	 * 指定の正規表現に合致する場合、trueを返します。
	 * </pre>
	 * @param item チェック対象項目
	 * @param strPattern 正規表現パターン
	 * @return true:対象有/ false:対象無
	 */
	public static boolean isPatternMatched(String item, String strPattern) {

		Pattern pattern = Pattern.compile(strPattern);
		Matcher matcher = null;
		String target = null;
		target = item;
		matcher = pattern.matcher(target);

		return matcher.matches();
	}
	

	/**
	 * <PRE>
	 * 入力されているかを検査します。
	 * </PRE>
	 * 
	 * @param a_Value String フィールド値
	 * @return boolean true:入力されている　false:入力されていない
	 * 
	 */
	public static boolean hasValue(String a_Value){
		try{
			return (0 != a_Value.length());
		}catch(NullPointerException ne){
			return false;
		}
	}	
	/**
	 * <PRE>
	 * isAllAscii
	 * 指定文字列が全てASCII文字で構成されている場合にtrueを返却します。
	 * 
	 * 検査対象文字列が入力されていない場合はtrueを返却します。
	 * 入力されているかの判断はhasValue()メソッドの仕様です。
	 * 
	 * </PRE>
	 * @param       a_Param String フィールド値
	 * @return      boolean true:全てASCII／false:そうではない
	 */
	public static boolean isAllAscii(String a_Param) {
		if(hasValue(a_Param)){
			CharArrayParser cap = new CharArrayParser();
			cap.parse(a_Param);
			return ((0 == cap.getFullWidthNum()) && (0 == cap.getHalfKanaNum()) && (0 == cap.getControlNum()));
		}else{
			return true;
		}
	}
    
	/**
	 * <PRE>
	 * isAllFullWidthChar
	 * 指定文字列が全て全角文字で構成されている場合にtrueを返却します。
	 * 
	 * 検査対象文字列が入力されていない場合はtrueを返却します。
	 * 入力されているかの判断はhasValue()メソッドの仕様です。
	 * 
	 * </PRE>
	 * @param       a_Param String フィールド値
	 * @return      boolean true:全て全角／false:そうではない
	 */
	public static boolean isAllFullWidthChar(String a_Param) {
		if(hasValue(a_Param)){
			CharArrayParser cap = new CharArrayParser();
			cap.parse(a_Param);
			return ((0 == cap.getHalfKanaNum()) && (0 == cap.getAsciiNum()) && (0 == cap.getControlNum()));
		}else{
			return true;
		}
	}
    
	/**
	 * <PRE>
	 * isMixedCharWidth
	 * 指定文字列中に全角文字と半角文字が混在している場合にtrueを返却します。
	 * 
	 * 検査対象文字列が入力されていない場合はtrueを返却します。
	 * 入力されているかの判断はhasValue()メソッドの仕様です。
	 * 
	 * </PRE>
	 * @param       a_Param String フィールド値
	 * @return      boolean true:全角と半角が混在している／false:混在していない
	 */
	public static boolean isMixedCharWidth(String a_Param) {
		if(hasValue(a_Param)){
			CharArrayParser cap = new CharArrayParser();
			cap.parse(a_Param);
			return ((0 != cap.getFullWidthNum()) && (0 != (cap.getAsciiNum() + cap.getHalfKanaNum())));
		}else{
			return true;
		}
	}
    
	private static boolean isHalfWidthKana(char ch) {
		return (('\uFF61' <= ch) && (ch <= '\uFF9F'));
	}
    
	private static boolean isAsciiChar(char ch) {
		return (('\u0020' <= ch) && (ch <= '\u007E'));
	}
    
	private static boolean isControlChar(char ch) {
		return (('\u0000' <= ch) && (ch < '\u0020'));
	}
    
	private static boolean isDateFormatChar(char ch) {
		return (('\u0030' <= ch) && (ch <= '\u0039') || ch == '\u002F');
	}

	static class CharArrayParser {
		private long fullWidthNum_;
		private long halfKanaNum_;
		private long asciiNum_;
		private long controlNum_;
        
		void parse(String a_Param) {
			char[] chs = a_Param.toCharArray();
			
			reset();
			
			for (int i = 0; i < chs.length; i++) {
				if (isAsciiChar(chs[i])) {
					++asciiNum_;
				} else if (isHalfWidthKana(chs[i])) {
					++halfKanaNum_;
				} else if (isControlChar(chs[i])) {
					++controlNum_;
				} else {
					++fullWidthNum_;
				}
			}
		}
        
		/**
		 * Returns the fullWidthNum.
		 * @return long
		 */
		public long getFullWidthNum() {
			return fullWidthNum_;
		}

		/**
		 * Returns the halfWidthNum.
		 * @return long
		 */
		public long getHalfKanaNum() {
			return halfKanaNum_;
		}

		/**
		 * Returns the asciiNum.
		 * @return long
		 */
		public long getAsciiNum() {
			return asciiNum_;
		}
        
		/**
		 * Returns the controlNum.
		 * @return long
		 */
		public long getControlNum() {
			return controlNum_;
		}
        
        private void reset() {
            fullWidthNum_   = 0L;
            halfKanaNum_    = 0L;
            asciiNum_       = 0L;
            controlNum_     = 0L;
        }
    }

	/**
	 * <PRE>
	 * isNotMixedCharWidth
	 * 指定文字列中に全角文字と半角文字が混在していない場合にtrueを返却します。
	 * 
	 * 検査対象文字列が入力されていない場合はtrueを返却します。
	 * 入力されているかの判断はhasValue()メソッドの仕様です。
	 * 
	 * </PRE>
	 * @param       a_Param String フィールド値
	 * @return      boolean true:全角と半角が混在していない／false:混在している
	 */
	public boolean isNotMixedCharWidth(String a_Param){
		if(hasValue(a_Param)){
			return !isMixedCharWidth(a_Param);
		}else{
			return true;
		}
	}
    
    /**
     * <PRE>
     * isCorrectStringLength
     * フィールド値の文字数が指定範囲内にあればtrueを返却します。
	 * 
	 * 検査対象文字列が入力されていない場合はtrueを返却します。
	 * 入力されているかの判断はhasValue()メソッドの仕様です。
	 * 
     * </PRE>
     * @param       a_Value String フィールド値
     * @param       a_MinSize int このフィールドが許容する文字数の最小値
     * @param       a_MaxSize int このフィールドが許容する文字数の最大値
     * @return      boolean true:指定範囲内／false:指定範囲外
     */    
    public static boolean isCorrectStringLength(String a_Value, int a_MinLen, int a_MaxLen) {
		if(hasValue(a_Value)){
			int len = a_Value.length();
		    return ((a_MinLen <= len) && (len <= a_MaxLen));
		}else{
			return true;
		}
    }

	/**
	 * <PRE>
	 * isInRange
	 * フィールド値の数値が指定範囲内にあればtrueを返却します。
	 * 
	 * 渡された引数が数値ではない場合は、falseを返却します。
	 * 
	 * 検査対象文字列が入力されていない場合はtrueを返却します。
	 * 入力されているかの判断はhasValue()メソッドの仕様です。
	 * 
	 * </PRE>
	 * @param       a_Value String フィールド値
	 * @param       a_Min int このフィールドが許容する最小値(以上)
	 * @param       a_Max int このフィールドが許容する最大値(未満)
	 * @return      boolean true:指定範囲内／false:指定範囲外
	 */    
	public static boolean isInRange(String a_Value, double a_Min, double a_Max) {
		if(hasValue(a_Value)){
			try{
				double num = Double.parseDouble(a_Value.replaceAll("\\,",""));
				return ((a_Min <=  num) && (num < a_Max));
			} catch( NumberFormatException ne ){
				return false;
			}
		}else{
			return true;
		}
	}

	/**
	 * <PRE>
	 * isCorrectFormat
	 * フィールド値が指定した正規表現にマッチしていればtrueを返却します。
	 * 
	 * 検査対象文字列が入力されていない場合はtrueを返却します。
	 * 入力されているかの判断はhasValue()メソッドの仕様です。
	 * 
	 * </PRE>
	 * @param       a_Value String フィールド値
	 * @param       a_Pattern String 正規表現
	 * @return      boolean true:フォーマットが指定した正規表現にマッチする／false:マッチしない
	 */
	public static boolean isCorrectFormat(String a_Value, String a_Pattern) {
		if(hasValue(a_Value)){
			if (0 != a_Pattern.length()) {
				return a_Value.matches(a_Pattern);
			}else{
				return false;
			}
		}else{
			return true;
		}
	}

	/**
	 * <PRE>
	 * isCorrectNumberLength
	 * 検査対象の桁数が整数部・小数部にわけて任意の桁数以内か検査します。
	 * 小数部の末尾に０が含まれている場合、末尾０も含む桁数で検査を行います。
	 * また、検査対象がカンマ入り数値の場合、カンマの位置が数値として正しいかは
	 * 判断せず、カンマを除いた桁数を検査します。
	 * 
	 * 渡された引数が数値ではない場合は、falseを返却します。
	 * 
	 * 検査対象文字列が入力されていない場合はtrueを返却します。
	 * 入力されているかの判断はhasValue()メソッドの仕様です。
	 * 
	 * </PRE>
	 * @param a_Value String フィールド値
	 * @param a_Integer int　整数部桁数
	 * @param a_Fraction int　小数部桁数
	 * @return boolean true:桁数以内／false:桁数外
	 * 
	 */
	public static boolean isCorrectNumberLength(String a_Value , int a_Integer , int a_Fraction){
		boolean correct = false;
		try{
			if(hasValue(a_Value)){
				BigDecimal decimal = new BigDecimal(a_Value.replaceAll("^-|\\,",""));
				int scale = decimal.scale();
				if( 0 < scale ){
					correct = ( a_Integer >= String.valueOf(decimal.longValue()).length() && a_Fraction >= scale );
				}else{
					correct = ( a_Integer >= String.valueOf(decimal.longValue()).length() );
				}
			}else{
				correct = true;
			}
		} catch ( NumberFormatException ne ) {
			correct = false;
		}
		return correct;
	}
    
	/**
	 * <PRE>
	 * isValidDate
	 * 妥当な日付である場合にtrueを返却します。
	 * 日付のフォーマットは「YYYYMMDD」「YYYY/MM/DD」「YYYY/M/D」「YYYY/MM/D」「YYYY/M/DD」です。
	 * 
	 * 検査対象文字列が入力されていない場合はtrueを返却します。
	 * 入力されているかの判断はhasValue()メソッドの仕様です。
	 * 
	 * </PRE>
	 * @param       a_Param String フィールド値
	 * @return      boolean true:日付として妥当である／false:日付としては妥当でない
	 */
	public static boolean isValidDate(String a_Param) {	    
		if(hasValue(a_Param)){
			/* 日付として不当な文字(0～9 or スラッシュ以外)だったらfalseを返却 */
			StringCharacterIterator it = new StringCharacterIterator(a_Param);
			for (char c = it.first(); c != CharacterIterator.DONE; c = it.next()) {
				if (!isDateFormatChar(c)) {
					return false;
				}
			}

			try {
		        StringBuffer sb = new StringBuffer();
		        StringTokenizer st = new StringTokenizer(a_Param, "/");
		        int slashCnt = st.countTokens() - 1;

		        String dtFormat = "";
		        if (slashCnt==0){
		            // スラッシュ無しの場合
		            dtFormat = "yyyyMMdd";
					if(a_Param.length() != 8){
						return false;
					}
		        }else if (slashCnt==2){
		            // スラッシュ有りの場合
		            dtFormat = "yyyy/MM/dd";
					if(a_Param.length() > 10){
						return false;
					}
		        }else {
		        	return false;
		        }

		        SimpleDateFormat sdf = new SimpleDateFormat(dtFormat);
				sdf.setLenient(false);

				sdf.parse(a_Param);
				return true;
			} catch (ParseException e) {
				return false;
			}
		}else{
			return true;
		}
	}


	/**
	 * <PRE>
	 * 項目数の妥当性検査です。
	 * </PRE>
	 * 
	 * @param target 入力値
	 * @param err エラーメッセージ
	 * @exception Inf23BtValidationException チェックエラー
	 */
	public static void validateColumn(String[] target,int len, Una23011ErrorBean err) throws Inf23BtValidationException {
		if (target.length != len)
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
	}
	
	/**
	 * <PRE>
	 * 文字列がブランクかどうかの妥当性検査です。
	 * （文字列がnullまたは空文字か全角半角スペースのみならブランクとみなします）
	 * </PRE>
	 * 
	 * @param value 入力値
	 * @param err エラーメッセージ
	 * @exception Inf23BtValidationException チェックエラー
	 */
	public static void validateBlank(String target, Una23011ErrorBean err) throws Inf23BtValidationException {
		if (isBlank(target))
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
	}
	
	/**
	 * <PRE>
	 * 文字列がブランクかどうかの妥当性検査です。
	 * （文字列がnullまたは空文字か全角半角スペースのみならブランクとみなします）
	 * </PRE>
	 * 
	 * @param value 入力値
	 * @param err エラーメッセージ
	 * @exception Inf23BtValidationException チェックエラー
	 */
	public static void validateBothBlank(String target1, String target2, Una23011ErrorBean err) throws Inf23BtValidationException {
		if (isBlank(target1) && isBlank(target2))
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
	}
	
	/**
	 * <PRE>
	 * 文字列がブランクかどうかの妥当性検査です。
	 * （文字列がnullまたは空文字か全角半角スペースのみならブランクとみなします）
	 * </PRE>
	 * 
	 * @param value 入力値
	 * @param err エラーメッセージ
	 * @exception Inf23BtValidationException チェックエラー
	 */
	public static void validateBothNotBlank(String target1, String target2, Una23011ErrorBean err) throws Inf23BtValidationException {
		if (!isBlank(target1) && !isBlank(target2))
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
	}
	
	/**
	 * <PRE>
	 * 文字列がブランクかどうかの妥当性検査です。
	 * （文字列がnullまたは空文字か全角半角スペースのみならブランクとみなします）
	 * </PRE>
	 * 
	 * @param value 入力値
	 * @param err エラーメッセージ
	 * @exception Inf23BtValidationException チェックエラー
	 */
	public static void validateEitherBlank(String target1, String target2, Una23011ErrorBean err) throws Inf23BtValidationException {
		if (isBlank(target1) && !isBlank(target2) || !isBlank(target1) && isBlank(target2))
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
	}
	
	/**
	 * <PRE>
	 * 数値項目（負数不可）の妥当性検査です。
	 *
	 * 以下のチェックを行います。
	 * ・入力値が桁数の範囲外です。
	 * ・$には正の数値を入力して下さい。
	 * ・$には整数部$桁以内で入力して下さい。（整数のみの場合）
	 * ・$は整数部$桁、小数部$桁以内で入力して下さい。（小数可の場合）
	 * </PRE>
	 *
	 * @param value 入力値
	 * @param integerMax 整数部最大桁数
	 * @param fractionMax 小数部最大桁数
	 * @param err エラーメッセージ用
	 * @exception Inf23BtValidationException チェックエラー
	 */
	public static void validateNonNegativeNumber(String value, int integerMax, int fractionMax, Una23011ErrorBean err)
		throws Inf23BtValidationException {

		validateNumberImpl(value, integerMax, fractionMax, err, false, false);
	}
	
	/**
	 * <PRE>
	 * バイト数の妥当性検査です。
	 *
	 * 以下のチェックを行います。
	 * ・入力値がバイト数の範囲外です。
	 * </PRE>
	 *
	 * @param value 入力値
	 * @param maxLength 最大バイト数
	 * @param err エラーメッセージ用
	 * @exception Inf23BtValidationException チェックエラー
	 */
	public static void validateBytesLength(String value, int maxLength, Una23011ErrorBean err)
		throws Inf23BtValidationException {

		if (checkLengthByBytes(value, maxLength))
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
	}

	/**
	 * <PRE>
	 * 数値項目（負数可）の妥当性検査です。
	 *
	 * 以下のチェックを行います。
	 * ・入力値が桁数の範囲外です。
	 * ・$には数値を入力して下さい。
	 * ・$には整数部$桁以内で入力して下さい。（整数のみの場合）
	 * ・$は整数部$桁、小数部$桁以内で入力して下さい。（小数可の場合）
	 * </PRE>
	 *
	 * @param value 入力値
	 * @param integerMax 整数部最大桁数
	 * @param fractionMax 小数部最大桁数
	 * @param err エラーメッセージ
	 * @exception Inf23BtValidationException チェックエラー
	 */
	public static void validateNumber(String value, int integerMax, int fractionMax, Una23011ErrorBean err)
		throws Inf23BtValidationException {

		validateNumberImpl(value, integerMax, fractionMax, err, true, false);
	}

	/**
	 * <PRE>
	 * 先頭ゼロ埋め数値項目の妥当性検査です。
	 *
	 * 以下のチェックを行います。
	 * ・入力値が桁数の範囲外です。
	 * ・$には正の数値を入力して下さい。
	 * ・$には整数部$桁以内で入力して下さい。
	 * </PRE>
	 *
	 * @param value 入力値
	 * @param maxLength 最大桁数
	 * @param err エラーメッセージ
	 * @exception Inf23BtValidationException チェックエラー
	 */
	public static void validatePadZeroNumber(String value, int maxLength, Una23011ErrorBean err) throws Inf23BtValidationException {

		validateNumberImpl(value, maxLength, 0, err, false, true);
	}

	/**
	 * <PRE>
	 * 数値項目の妥当性検査の実装です。
	 *
	 * 以下のチェックを行います。
	 * ・入力値が桁数の範囲外です。
	 * ・$には正の数値を入力して下さい。(正数のみの場合)
	 * ・$には数値を入力して下さい。(負数可の場合)
	 * ・$には整数部$桁以内で入力して下さい。（整数のみの場合）
	 * ・$は整数部$桁、小数部$桁以内で入力して下さい。（小数可の場合）
	 * ・$には小数部$桁以内で入力して下さい。
	 * </PRE>
	 *
	 * @param value 入力値
	 * @param integerMax 整数部最大桁数
	 * @param fractionMax 小数部最大桁数
	 * @param err エラーメッセージ
	 * @param containsNegative 負数可否
	 * @param padZero 先頭ゼロ埋め有無
	 * @exception Inf23BtValidationException チェックエラー
	 */
	private static void validateNumberImpl(
		String value,
		int integerMax,
		int fractionMax,
		Una23011ErrorBean err,
		boolean containsNegative,
		boolean padZero)
		throws Inf23BtValidationException {

		if (!Inf23BtValidationStringUtil.hasValue(value)) {
			return;
		}

		/* カンマ削除 */
		String noCommaVal = value.replaceAll("\\,", "");

		/* カンマのみの入力ならエラー */
		if ("".equals(noCommaVal)) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}

		/* 全体桁数チェック */
		int maxLength = 0;
		maxLength += integerMax;
		if (fractionMax > 0) {
			maxLength += ".".length();
			maxLength += fractionMax;
		}
		if (!Inf23BtValidationStringUtil.isCorrectStringLength(noCommaVal.replaceFirst("-", ""), 1, maxLength)) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}

		/* 数値フォーマットチェック */
		if (!isNumber(noCommaVal, padZero)) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}

		/* 正負チェック */
		if (!containsNegative) {

			/* $には正の数値を入力して下さい。 */
			BigDecimal bigDecBNum = new BigDecimal(noCommaVal);
			if (bigDecBNum.compareTo(BigDecimal.valueOf(0)) < 0) {
				throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
			}
		}

		/* 整数部/小数部別の桁数チェック */
		if (!Inf23BtValidationStringUtil.isCorrectNumberLength(noCommaVal, integerMax, fractionMax)) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}
	}

	/**
	 * <PRE>
	 * コード値項目の妥当性検査です。
	 *
	 * 以下のチェックを行います。
	 * ・認識できない文字が含まれています。
	 * ・$には半角英数字を入力して下さい。。
	 * ・$には$文字以内で入力して下さい。
	 * </PRE>
	 *
	 * @param value 入力値
	 * @param maxLength 最大桁数
	 * @param err エラーメッセージ
	 * @exception Inf23BtValidationException チェックエラー
	 */
	public static void validateCodeNoLower(String value, int maxLength, Una23011ErrorBean err) throws Inf23BtValidationException {

		if (!Inf23BtValidationStringUtil.hasValue(value)) {
			return;
		}

		/* $には半角英数字を入力して下さい。 */
		if (!Inf23BtValidationStringUtil.isCorrectFormat(value, "[0-9a-zA-Z]*")) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}
		
		/* $には大文字を入力して下さい。 */
		if (hasLowerCaseChar(value)) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}

		/* $には$文字以内で入力して下さい。 */
		if (!Inf23BtValidationStringUtil.isCorrectStringLength(value, 1, maxLength)) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}
	}

	/**
	 * <PRE>
	 * コード値項目の妥当性検査です。
	 *
	 * 以下のチェックを行います。
	 * ・認識できない文字が含まれています。
	 * ・$には半角英数字を入力して下さい。。
	 * ・$には$文字以内で入力して下さい。
	 * </PRE>
	 *
	 * @param value 入力値
	 * @param length 固定桁数
	 * @param err エラーメッセージ
	 * @exception Inf23BtValidationException チェックエラー
	 */
	public static void validateCodeNoLowerLength(String value, int length, Una23011ErrorBean err) throws Inf23BtValidationException {

		if (!Inf23BtValidationStringUtil.hasValue(value)) {
			return;
		}

		/* $には半角英数字を入力して下さい。 */
		if (!Inf23BtValidationStringUtil.isCorrectFormat(value, "[0-9a-zA-Z]*")) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}
		
		/* $には大文字を入力して下さい。 */
		if (hasLowerCaseChar(value)) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}

		/* $には$文字以内で入力して下さい。 */
		if (!Inf23BtValidationStringUtil.isCorrectStringLength(value, length, length)) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}
	}

	/**
	 * <PRE>
	 * コード値項目の妥当性検査です。
	 *
	 * 以下のチェックを行います。
	 * ・$には半角英数字を入力して下さい。。
	 * ・$には$文字以内で入力して下さい。
	 * </PRE>
	 *
	 * @param value 入力値
	 * @param maxLength 最大桁数
	 * @param err エラーメッセージ
	 * @exception Inf23BtValidationException チェックエラー
	 */
	public static void validateCodeWithSpace(String value, int maxLength, Una23011ErrorBean err) throws Inf23BtValidationException {

		if (!Inf23BtValidationStringUtil.hasValue(value)) {
			return;
		}

		/* $には半角英数字を入力して下さい。 */
		if (!Inf23BtValidationStringUtil.isCorrectFormat(value, "[0-9a-zA-Z ]*")) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}
		
		/* $には$文字以内で入力して下さい。 */
		if (!Inf23BtValidationStringUtil.isCorrectStringLength(value, 1, maxLength)) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}
	}

	/**
	 * <PRE>
	 * コード値項目の妥当性検査です。
	 *
	 * 以下のチェックを行います。
	 * ・$には半角英数字を入力して下さい。。
	 * ・$には$文字以内で入力して下さい。
	 * </PRE>
	 *
	 * @param value 入力値
	 * @param maxLength 最大桁数
	 * @param err エラーメッセージ
	 * @exception Inf23BtValidationException チェックエラー
	 */
	public static void validateCode(String value, int maxLength, Una23011ErrorBean err) throws Inf23BtValidationException {

		if (!Inf23BtValidationStringUtil.hasValue(value)) {
			return;
		}

		/* $には半角英数字を入力して下さい。 */
		if (!Inf23BtValidationStringUtil.isCorrectFormat(value, "[0-9a-zA-Z]*")) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}
		
		/* $には$文字以内で入力して下さい。 */
		if (!Inf23BtValidationStringUtil.isCorrectStringLength(value, 1, maxLength)) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}
	}

	/**
	 * <PRE>
	 * コード値項目の妥当性検査です。
	 *
	 * 以下のチェックを行います。
	 * ・$には半角英数字を入力して下さい。。
	 * ・$には$文字で入力して下さい。
	 * </PRE>
	 *
	 * @param value 入力値
	 * @param length 固定桁数
	 * @param err エラーメッセージ
	 * @exception Inf23BtValidationException チェックエラー
	 */
	public static void validateCodeLength(String value, int length, Una23011ErrorBean err) throws Inf23BtValidationException {

		if (!Inf23BtValidationStringUtil.hasValue(value)) {
			return;
		}

		/* $には半角英数字を入力して下さい。 */
		if (!Inf23BtValidationStringUtil.isCorrectFormat(value, "[0-9a-zA-Z]*")) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}
		
		/* $には$文字以内で入力して下さい。 */
		if (!Inf23BtValidationStringUtil.isCorrectStringLength(value, length, length)) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}
	}

	/**
	 * <PRE>
	 * カナ項目の妥当性検査です。
	 *
	 * 以下のチェックを行います。
	 * ・認識できない文字が含まれています。
	 * ・$には半角文字を入力して下さい。
	 * ・$はできません。 : $ + "には小文字の英字入力"
	 * ・$には$文字以内で入力して下さい。
	 * </PRE>
	 *
	 * @param value 入力値
	 * @param maxLength 最大桁数
	 * @param err エラーメッセージ
	 * @exception Inf23BtValidationException チェックエラー
	 */
	public static void validateHalfKana(String value, int maxLength, Una23011ErrorBean err) throws Inf23BtValidationException {

		if (!Inf23BtValidationStringUtil.hasValue(value)) {
			return;
		}

		/* $には半角文字を入力して下さい。 */
		if (!(isAllHalf(value))) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}
		
		/* $には大文字を入力して下さい。 */
		if (hasLowerCaseChar(value)) {
//			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}

		/* $には$文字以内で入力して下さい。 */
		if (!Inf23BtValidationStringUtil.isCorrectStringLength(value, 1, maxLength)) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}
	}

	/**
	 * <PRE>
	 * 全角項目の妥当性検査です。
	 *
	 * 以下のチェックを行います。
	 * ・認識できない文字が含まれています。
	 * ・$には全角で入力して下さい。
	 * ・$には$文字以内で入力して下さい。
	 * </PRE>
	 *
	 * @param value 入力値
	 * @param maxLength 最大桁数
	 * @param err エラーメッセージ
	 * @exception Inf23BtValidationException チェックエラー
	 */
	public static void validateZenkaku(String value, int maxLength, Una23011ErrorBean err) throws Inf23BtValidationException {

		if (!Inf23BtValidationStringUtil.hasValue(value)) {
			return;
		}

		/* $には全角で入力して下さい。 */
		if (!Inf23BtValidationStringUtil.isAllFullWidthChar(value)) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}

		/* $には$文字以内で入力して下さい。 */
		if (!Inf23BtValidationStringUtil.isCorrectStringLength(value, 1, maxLength)) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}
	}

	/**
	 * <PRE>
	 * 半角項目の妥当性検査です。
	 *
	 * 以下のチェックを行います。
	 * ・認識できない文字が含まれています。
	 * ・$には半角文字を入力して下さい。
	 * ・$には大文字を入力して下さい。
	 * ・$には$文字以内で入力して下さい。
	 * </PRE>
	 *
	 * @param value 入力値
	 * @param maxLength 最大桁数
	 * @param err エラーメッセージ
	 * @exception Inf23BtValidationException チェックエラー
	 */
	public static void validateHankaku(String value, int maxLength, Una23011ErrorBean err) throws Inf23BtValidationException {

		if (!Inf23BtValidationStringUtil.hasValue(value)) {
			return;
		}

		/* $には半角文字を入力して下さい。 */
		if (!(isAllHalf(value))) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}

		/* $には大文字を入力して下さい。 */
		if (hasLowerCaseChar(value)) {
			// throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}

		/* $には$文字以内で入力して下さい。 */
		if (!Inf23BtValidationStringUtil.isCorrectStringLength(value, 1, maxLength)) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}
	}

	/**
	 * <PRE>
	 * 半角項目の妥当性検査です。
	 *
	 * 以下のチェックを行います。
	 * ・認識できない文字が含まれています。
	 * ・$には半角文字を入力して下さい。
	 * ・$には大文字を入力して下さい。
	 * ・$には$文字以内で入力して下さい。
	 * </PRE>
	 *
	 * @param value 入力値
	 * @param maxLength 最大桁数
	 * @param err エラーメッセージ
	 * @exception Inf23BtValidationException チェックエラー
	 */
	public static void validateHankakuNoLower(String value, int maxLength, Una23011ErrorBean err) throws Inf23BtValidationException {

		if (!Inf23BtValidationStringUtil.hasValue(value)) {
			return;
		}

		/* $には半角文字を入力して下さい。 */
		if (!(isAllHalf(value))) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}

		/* $には大文字を入力して下さい。 */
		if (hasLowerCaseChar(value)) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}

		/* $には$文字以内で入力して下さい。 */
		if (!Inf23BtValidationStringUtil.isCorrectStringLength(value, 1, maxLength)) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}
	}

	/**
	 * <PRE>
	 * 日付項目の妥当性検査です。
	 *
	 * 以下のチェックを行います。
	 * ・認識できない文字が含まれています。
	 * ・妥当な日付で有る事｡
	 * </PRE>
	 *
	 * @param value 入力値
	 * @param err エラーメッセージ
	 * @exception Inf23BtValidationException チェックエラー
	 */
	public static void validateDate(String value, Una23011ErrorBean err) throws Inf23BtValidationException {

		if (!Inf23BtValidationStringUtil.hasValue(value)) {
			return;
		}

		/* 妥当な日付で有る事｡ */
		if (!Inf23BtValidationStringUtil.isValidDate(value)) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}
	}
	
	/**
	 * <PRE>
	 * 日付項目の妥当性検査です。
	 *
	 * 以下のチェックを行います。
	 * ・認識できない文字が含まれています。
	 * ・妥当な日付で有る事｡
	 * </PRE>
	 *
	 * @param value1 入力値
	 * @param value2 入力値
	 * 
	 * @param err エラーメッセージ
	 * @exception Inf23BtValidationException チェックエラー
	 */
	public static void validateDateCompare(String value1, String value2, Una23011ErrorBean err) throws Inf23BtValidationException {

		/* 妥当な日付で有る事｡ */
		if (value1.compareTo(value2) > 0) {
			throw new Inf23BtValidationException(err.getErrCode(), err.getErrMsg());
		}
	}

	/**
	 * <PRE>
	 * 数値項目が値を持つか判定します。
	 * "0"は値なしとみなします。
	 * 数値でない値が入力されていた場合は値ありとします。
	 * </PRE>
	 *
	 * @param value 対象文字列
	 * @return 値を持つならtrue
	 */
	public static boolean hasValueNum(String value) {

		/* ""やnullなら値なし */
		if (!Inf23BtValidationStringUtil.hasValue(value)) {
			return false;
		}

		/* カンマ削除 */
		String noCommaVal = value.replaceAll("\\,", "");

		/* カンマのみなら値あり */
		if (!Inf23BtValidationStringUtil.hasValue(noCommaVal)) {
			return true;
		}

		/* 数値でない場合は値あり */
		if (!isNumber(noCommaVal, false)) {
			return true;
		}

		/* 0なら値なしとみなす */
		BigDecimal numObj = new BigDecimal(noCommaVal);
		if (BigDecimal.valueOf(0).compareTo(numObj) == 0) {
			return false;
		}

		return true;
	}

	/**
	 * <PRE>
	 * 数値文字列チェックを行います。
	 * </PRE>
	 *
	 * @param str チェック対象文字列
	 * @param padZero 先頭ゼロ埋め有無
	 * @return boolean 数値ならtrue
	 */
	private static boolean isNumber(String str, boolean padZero) {
		StringBuffer regEx = new StringBuffer(); // 正規表現

		/* 符号部 */
		regEx.append("-?");

		/* 整数部 */
		if (padZero) {
			regEx.append("[0-9]+");
		} else {
			regEx.append("(0|[1-9][0-9]*)");
		}

		/* 小数部 */
		regEx.append("(\\.[0-9]+)?");

		/* チェック実行 */
		return Inf23BtValidationStringUtil.isCorrectFormat(str, regEx.toString());
	}

	/**
	 * <PRE>
	 * 半角カナチェックを行います。
	 * </PRE>
	 *
	 * @param param チェック対象文字列
	 * @return boolean 全て半角カナならtrue
	 */
	private static boolean isAllHalf(String param) {
		char[] chs = param.toCharArray();

		for (int i = 0; i < chs.length; i++) {
			if (!(('\uFF61' <= chs[i]) && (chs[i] <= '\uFF9F')) && !(('\u0020' <= chs[i]) && (chs[i] <= '\u007E'))) {
				return false;
			}
		}

		return true;
	}
    
    /**
     * <PRE>
     * 英小文字チェックを行います。
     * </PRE>
     *
     * @param str チェック対象文字列
     * @return boolean 英小文字が含まれていればtrue
     */
    private static boolean hasLowerCaseChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

	/**
	 * <PRE>
	 * スピン番号チェック処理を実行します
	 * </PRE>
	 * 
     * @param str チェック対象文字列
     * @return boolean 番号形態ならばエラー：true
	 */
	public static boolean isNoCode(String str) {

		/** 数値パターン */
		final String NUMBER_PATTERN = "[0-9]{1,5}";

		/** 区切文字 ハイフン */
		final String DELIMITER_PATTERN_HYPHEN = "-";
		/** 区切文字 カンマ */
		final String DELIMITER_PATTERN_COMMA = ",";
	
		String lastString = "";

		/* 入力値無しはチェックしない */
		if (Inf23BtValidationStringUtil.hasValue(str)) {

			lastString = String.valueOf(str.charAt(str.length()-1));

			/* 最後がカンマ若しくはハイフンはエラー */
			if (lastString.equals(DELIMITER_PATTERN_COMMA)
				|| lastString.equals(DELIMITER_PATTERN_HYPHEN)) {
				return false;
			} else {

				/* カンマで区切る */
				String[] orNmArray = str.split(DELIMITER_PATTERN_COMMA);
				int count = orNmArray.length;

				/* カンマで区切られた折名の数だけ繰り返します。途中でエラーフラグが立ったら処理を抜けます */
				for (int i = 0;(i < count); i++) {

					/* カンマで区切られた文字列をハイフンで区切ります */
					String[] value = orNmArray[i].split(DELIMITER_PATTERN_HYPHEN);

					/* 区切った結果が３つ以上であればエラーとします */
					if (3 <= value.length) {
						return false; // エラー
					}else if(value.length == 0){
						return false; // エラー
					}
					for(int j = 0; j <value.length; j++) {

						/* 正規表現と一致するかチェックします */
						if (!Inf23BtValidationStringUtil.isCorrectFormat(value[j], "[0-9a-zA-Z]*")) {
							/* マッチしない場合はエラーとします */
							return false; // エラー
						}
						if (!Inf23BtValidationStringUtil.hasValue(value[j])) {
							return false; // エラー
						}
					}
					if (value.length > 1) {

						/* ハイフンで区切られた文字が、両方とも同じパターンかを判定します */
						if ((value[0].matches(NUMBER_PATTERN))
							&& (value[1].matches(NUMBER_PATTERN))) {

							/* 数値の場合 */
							int startNumber = Integer.parseInt(value[0]);
							int endNumber = Integer.parseInt(value[1]);

							if (startNumber == endNumber) {

								/* 開始値と終了値が同値の場合エラーフラグを立てます */
								return false; // エラー
							} else if (startNumber > endNumber) {

								/* 開始値が終了値より大きい場合エラーフラグを立てます */
								return false; // エラー
							}

	                    }
	                }
	            }
	        }
		}

        return true;
	}

	/**
	 * <PRE>
	 * 文字列がブランクかどうか判定します。
	 * （文字列がnullまたは空文字か全角半角スペースのみならブランクとみなします）
	 * </PRE>
	 * 
	 * @param str 判定したい文字列
	 * @return boolean ture:文字列がブランク false:文字列がブランクではない
	 */
	public static boolean isBlank(String str) {
		try {
			return Inf23BtValidationStringUtil.trimString(str).length() == 0;

		} catch (NullPointerException npe) {
			return true;
		}
	}
	
	/**
	 * <PRE>
	 * 文字列の桁数をバイト数でチェックします。
	 * </PRE>
	 * @param str
	 * @param maxByte
	 * @return boolean T/F バイト数以上
	 */
	public static boolean checkLengthByBytes(String str, int maxB) {
		if (str == null ) {
			return true;
		}
		char[] chs = str.toCharArray();
		int cnt = 0;
		for (int i = 0; i < chs.length; i++) {
			if (!(('\uFF61' <= chs[i]) && (chs[i] <= '\uFF9F')) && !(('\u0020' <= chs[i]) && (chs[i] <= '\u007E')) && !((chs[i] =='\r') || (chs[i] =='\n'))) {
				cnt += 2;
			} else {
				cnt++;
			}
		}

		if (cnt > maxB) {
			return true;
		}
		
		return false;
	}


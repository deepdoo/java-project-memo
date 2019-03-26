
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

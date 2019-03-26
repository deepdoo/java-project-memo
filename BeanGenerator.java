public class BeanGenerator {

	private static boolean isBlankLine(String row) {
		return row != null && row.length() > 0;
	}
	
	private static String fixFiled(String filed) {
		String outfiled = "";
		java.util.regex.Matcher mr = java.util.regex.Pattern.compile("_").matcher(filed);
		
		int index = 0;
		while (mr.find()) {
			if (index > 0) {
				outfiled += toFirstUpperCase(filed.toLowerCase().substring(index, mr.start()));
			} else {
				outfiled += filed.toLowerCase().substring(index, mr.start());
			}
			index = mr.end();
		}
		outfiled += toFirstUpperCase(filed.toLowerCase().substring(index));
		return outfiled;
	}
	
	private static String toFirstUpperCase(String str) {
		return (str != null && str.length() > 0) ? String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1) : "";
	}
	
	
	private static void writeFileds(BufferedWriter bw, List keys, List values) throws IOException {
		
		for (int i = 0; i < keys.size(); i++) {

			bw.newLine();
			bw.newLine();
			bw.write("	/** "+values.get(i)+" **/");
			bw.newLine();
			bw.write("	private String "+keys.get(i)+";");
			
		}
	}
	private static void writeToString(BufferedWriter bw, List keys, List values) throws IOException {
		bw.newLine();
		bw.newLine();
		bw.write("	/**" + "\r\n");
		bw.write("	 * <PRE>" + "\r\n");
		bw.write("	 * このオブジェクトのString型です。" + "\r\n");
		bw.write("	 * </PRE>" + "\r\n");
		bw.write("	 *" + "\r\n");
		bw.write("	 * @return オブジェクト内容" + "\r\n");
		bw.write("	 */" + "\r\n");
		bw.write("	public String toString() {" + "\r\n");
		bw.write("		StringBuffer sb = new StringBuffer();" + "\r\n");
		bw.write("		sb.append(super.toString());" + "\r\n");

		for (int i = 0; i < keys.size(); i++) {
			bw.write("		sb.append(\"\\t"+keys.get(i)+"=[\" + this."+keys.get(i)+" + \"]\\n\"); // " + values.get(i) +  "\r\n");
		}
		bw.write("		return sb.toString();" + "\r\n");
		bw.write("	}" + "\r\n");
	}
	

	private static void writeReset(BufferedWriter bw, List keys, List values) throws IOException {
		bw.newLine();
		bw.newLine();
		bw.write("	/**" + "\r\n");
		bw.write("	 * <PRE>" + "\r\n");
		bw.write("	 * 値をクリアします。" + "\r\n");
		bw.write("	 * </PRE>" + "\r\n");
		bw.write("	 */" + "\r\n");
		bw.write("	public void reset() {" + "\r\n");
		bw.write("		super.reset();" + "\r\n");


		for (int i = 0; i < keys.size(); i++) {
			bw.write("		this."+keys.get(i)+" = ComBtStringUtil.STR_EMPTY; // "+ values.get(i) + "\r\n");
		}
		bw.write("	}" + "\r\n");
	}

	private static void writeGetterSetter(BufferedWriter bw, List keys, List values) throws IOException {
		for (int i = 0; i < keys.size(); i++) {
			bw.newLine();
			bw.newLine();
			bw.write("	/**" + "\r\n");
			bw.write("	 * <PRE>" + "\r\n");
			bw.write("	 * "+ values.get(i) + "を取得します。" + "\r\n");
			bw.write("	 * <PRE>" + "\r\n");
			bw.write("	 *" + "\r\n");
			bw.write("	 * @return "+ values.get(i) + "\r\n");
			bw.write("	 */" + "\r\n");
			bw.write("	public String get"+toFirstUpperCase((String)keys.get(i))+"() {" + "\r\n");
			bw.write("		return this."+keys.get(i)+";" + "\r\n");
			bw.write("	}" + "\r\n");
			bw.newLine();
			bw.newLine();
			bw.write("	/**" + "\r\n");
			bw.write("	 * <PRE>" + "\r\n");
			bw.write("	 * "+ values.get(i) + "を設定します。" + "\r\n");
			bw.write("	 * </PRE>" + "\r\n");
			bw.write("	 *" + "\r\n");
			bw.write("	 * @param "+keys.get(i)+" "+ values.get(i) + "\r\n");
			bw.write("	 */" + "\r\n");
			bw.write("	public void set"+toFirstUpperCase((String)keys.get(i))+"(String "+keys.get(i)+") {" + "\r\n");
			bw.write("		this."+keys.get(i)+" = "+keys.get(i)+";" + "\r\n");
			bw.write("	}" + "\r\n");
		}
	}

	private static void writeConvertion(BufferedWriter bw, List keys, List values) throws IOException {
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.newLine();
		for (int i = 0; i < keys.size(); i++) {
			bw.write("	bean.set"+toFirstUpperCase((String)keys.get(i))+"(row["+(i+5)+"]); // " + values.get(i) + "\r\n");
		}
	}
	public static void main(String[] args) {
		
		if (args.length < 1) {
			System.out.println("input file is required.");
			System.exit(0);
		}
		String filePath = args[0];
		File inputFile = new File(filePath);
		File outFile = new File(inputFile.getParent()+File.separator+inputFile.getName()+".java.txt");
		
		BufferedWriter bw = null;
		BufferedReader br = null;
		try {
			outFile.createNewFile();
			br = new BufferedReader(new FileReader(inputFile));
			bw = new BufferedWriter(new FileWriter(outFile));
			
			String row = null;

			List keys = new ArrayList();
			List values = new ArrayList();
			
			while ((row = br.readLine()) != null && row.length() > 0) {

				String comment = row.substring(0, row.indexOf("\t")).trim();
				String field = fixFiled(row.substring(row.indexOf("\t")).trim());
				keys.add(field);
				values.add(comment);
				
				
			}

			writeFileds(bw, keys, values);
			writeToString(bw, keys, values);
			writeReset(bw, keys, values);
			writeGetterSetter(bw, keys, values);
			writeConvertion(bw, keys, values);
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}

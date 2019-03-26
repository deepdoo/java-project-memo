
public class BitmapSamples {

	private static BufferedImage map(int sizeX, int sizeY) throws FileNotFoundException, FontFormatException,
		IOException {
		final BufferedImage res = new BufferedImage(sizeX, sizeY, 1);

		for (int x = 0; x < sizeX; x++) {
			for (int y = 0; y < sizeY; y++) {
				if (x == 0 && y == sizeY - 1) {
					res.setRGB(x, y, Color.GRAY.getRGB());
				} else {
					res.setRGB(x, y, Color.WHITE.getRGB());
				}
			}
		}

		Graphics2D g = res.createGraphics();

		//        Font font = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream("M:/digitalism.TTF"));
		//        font = font.deriveFont(20F);
		//        
		g.setFont(new Font("TimesRoman", Font.BOLD, 17));
		g.setColor(Color.GRAY);
		g.drawString("ABWED", 2, 20);
		return res;
	}

	private static void savePNG(final BufferedImage bi, final String path) {
		try {
			RenderedImage rendImage = bi;
			ImageIO.write(rendImage, "bmp", new File(path));
			//ImageIO.write(rendImage, "PNG", new File(path));
			//ImageIO.write(rendImage, "jpeg", new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void wf(List<String> strList) {
		BufferedWriter bw = null;

		try {
			File csvFile = new File("M:/databmp.txt");
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(csvFile));
			bw = new BufferedWriter(osw);

			for (String row : strList) {
				bw.write(row);
				bw.newLine();
			}
			bw.flush();
		} catch (Exception e) {
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
				}
			}
		}
	}

	private static void readImg() {
		try {

			BufferedImage bufferedImg = ImageIO.read(new File("M:/test.bmp"));
			int width = bufferedImg.getWidth();
			int height = bufferedImg.getHeight();
			List strList = new ArrayList();
			for (int j = 0; j < height; j++) {
				String line = "";
				for (int i = 0; i < width; i++) {
					int ss = bufferedImg.getRGB(i, j);
					//					line += ss;
					if (ss != -1) {
						line += "■";
					} else {
						line += "□";
					}
				}

				System.out.println(line);
				//				strList.add(line);
			}
			//            wf(strList);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedImage img = map(100, 100);
		savePNG(img, "M:/test.bmp");
		readImg();
	}

}

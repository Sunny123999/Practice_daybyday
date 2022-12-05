package com.lihuan.Practice.ScreenShot;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenPrt {
    /**
     * 屏幕截图
     *
     * @param imageName 存储图片名称
     * @param path      图片路径
     * @param imgType   图片类型 png 或 jpg
     * @throws AWTException
     * @throws IOException
     */
    public static String cutPic(String imageName, String path, String imgType) throws AWTException, IOException {

        System.out.println("开始截图");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle screenRectangle = new Rectangle(screenSize);
        Robot robot = new Robot();
        BufferedImage image = robot.createScreenCapture(screenRectangle);
        //首先创建一个目录
        File file = new File(path);
        if (!file.isDirectory() || !file.exists()) {
            file.mkdir();
        }
        //判断文件是否存在，存在就改名字
        String fileName = imageName + "." + imgType;
        ImageIO.write(image, imgType, new File(path + fileName));
        String filePath = path + fileName;
        return filePath;
    }

    public static void main(String[] args) throws IOException, AWTException {
        cutPic("test", "E:\\Practice_daybyday\\", "png");
    }


}

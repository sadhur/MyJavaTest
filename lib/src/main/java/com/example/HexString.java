package com.example;

/**
 *
 * 16進位字串解析工具
 *
 * Created by ideabus on 2016/8/5.
 */
public class HexString {
    private   StringBuilder hexString;


    public HexString(String hexStr) {
        this.hexString = new StringBuilder(hexStr);

    }

    /**
     *
     * @param offset   要解析的字元數
     * @return
     */
    public int parseInt(int offset) {


        int ret = Integer.parseInt(hexString.substring(0, offset), 16);
        hexString.delete(0, offset);

        return ret;
    }

    public byte parseByte(int offset) {
        byte ret = 0;

        try{
            ret = Byte.parseByte(hexString.substring(0, offset), 16);
            hexString.delete(0, offset);

        }catch (NumberFormatException e)
        {
            System.out.println("log eeeeeeeeee");
            e.printStackTrace();
        }


        return ret;
    }


    public String cutStr(int offset) {

        String ret = hexString.substring(0, offset);
        hexString.delete(0, offset);

        return ret;
    }

    @Override
    public String toString() {
        return hexString.toString();
    }

    public int length() {
        return hexString.length();
    }
}

package com.example;

public class MyClass {

    static public int at(int i, int length) {
        long bitArray= 0x0c ;

        int mask = (~(0xFFFFFFFF<<length));

        long r = (bitArray >> i ) & mask;

        return (int)r;
    }

    static public void main(String[] args){

        System.out.println(at(3, 2));


//        try{
//            ret = Byte.parseByte(hexString.substring(0, offset), 16);
//            hexString.delete(0, offset);
//
//        }catch (NumberFormatException e)
//        {
//            System.out.println("log eeeeeeeeee");
//            e.printStackTrace();
//        }
//


//        byte b = 0x81;//-127;

//        System.out.println(String.format("%02X", b));


//        float tem = 3678/100.0f;
//        System.out.println("tem = " + tem);
//
//
//        byte i = -128;
//        System.out.println(i);
//        System.out.println(String.format("%X",i));
//
//        int i2 = -128;
//        System.out.println((int)i2);
//        System.out.println(String.format("%X",i2));
//
//        byte i3 = (byte)i2;
//        System.out.println((int)i3);
//        System.out.println(String.format("%X",i3));



//        Bits bitSet = new Bits(2);
//        bitSet.setMultiBits(12, 3, 7);
//
//        int d = bitSet.toInt();
//        System.out.println(String.format("%04X", d));
//
//
//        bitSet = new Bits(2);
//        bitSet.setMultiBits(12, 4, 8);
//
//        d = bitSet.toInt();
//        System.out.println(String.format("%04X", d));


//        String ws_id = "1";
//        int iUSR_seq = 230;
//
////        String json =  "{\"WS_ID\":\""+ws_id +"\",\"iUSR_SEQ\":\""+iUSR_seq+"\" }";
////        String json = String.format("{\"WS_ID\":\"%s\",\"iUSR_SEQ\":%d }", ws_id, iUSR_seq);
//
//        String json = null;
//        try {
//            json = new JSONStringer()
//                    .object()
//                    .key("WS_ID").value(ws_id)
//                    .key("iUSR_SEQ").value(iUSR_seq)
//                    .endObject()
//                    .toString();
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//        Logger.json(json);
    }
}

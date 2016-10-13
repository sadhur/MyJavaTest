package com.example;

/**
 * <pre>
 *
 *
 * Created by Tsai Chun-Ming on 2016/9/30.
 *
 * Company: Ideabus Technology Co. Ltd
 * email: ideabus.ming@gmail.com
 */
public class Bits {
    private int byteNum;
    private long bitArray;

    public Bits(int byteNum) {
        this.byteNum = byteNum;
        this.bitArray = 0L;
    }

    public Bits(int byteNum, int data) {
        this.byteNum = byteNum;
        this.bitArray = data;

    }

    public void set(int i, boolean enable) {
        int b = (enable)?  1: 0;

        b = b << i;
        bitArray = bitArray | b ;

    }

    public int toInt() {
        return (int) (bitArray & 0x00000000FFFFFFFF);
    }

    public boolean at(int i) {
        long r = (bitArray>>i ) & 0x01;

        return (r == 1);
    }

    public void setMultiBits(int i, int lengthOfDataBit, int data) {
        int mask = (~(0xFFFFFFFF<< lengthOfDataBit));

        bitArray = bitArray  |  ((data & mask) << i);

    }
}

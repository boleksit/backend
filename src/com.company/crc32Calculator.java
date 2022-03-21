package src.com.company;

public class crc32Calculator {
    static int[] CRC_TABLE=new int[256];
    public static void main (String[] args)
    {
        tableInitialize();
        System.out.println(crc32("This is example text ..."));
    }
    private static void tableInitialize()
    {
        for (int i=0;i<256;++i)
        {
            int code = i;
            for (var j=0;j<8;++j)
            {
                if ((0x01 & code)==1) {
                    code = 0xEDB88320 ^ (code>>>1);
                } else
                    code = code>>>1;
            }
            CRC_TABLE[i]=code;
        }
    }
    private static int crc32(String s) {
        var crc=-1;
        for (int i=0;i<s.length(); ++i)
        {
            var code = s.charAt(i);
            crc=CRC_TABLE[(code^crc)&0xFF]^(crc>>>8);
        }
        return (-1 ^crc)>>>0;
    }
}

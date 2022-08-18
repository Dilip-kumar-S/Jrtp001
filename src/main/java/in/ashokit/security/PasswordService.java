package in.ashokit.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService 
{

	/* Password Encoding */
	public static String encode(String txt)
	{
		Encoder encoder= Base64.getEncoder();
		return encoder.encodeToString(txt.getBytes());
	}
	
	/* Password Decoding */
	public static String decode(String txt)
	{
		Decoder decoder=Base64.getDecoder();
		byte[] decode = decoder.decode(txt);
		return new String(decode);
	}

}

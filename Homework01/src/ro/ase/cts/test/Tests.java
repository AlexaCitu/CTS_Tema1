package ro.ase.cts.test;


import ro.ase.cts.exceptions.CryptoSupportedException;
import ro.ase.cts.exceptions.InvalidVolumeException;
import ro.ase.cts.model.Coins;
import ro.ase.cts.model.Crypto;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests{
	
	@Test
	public void testBTC() {
		Crypto crypto= new Crypto(Coins.BITCOIN,9.73,3,"0.71%");
		try {
			assertEquals(11709, crypto.computePrice(),0.0001);
		}catch(CryptoSupportedException e) {
			System.out.println(e.getMessage());
		} catch (InvalidVolumeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testETH() {
		Crypto crypto= new Crypto(Coins.ETHEREUM, 4.57, 5, "1.23%");
		try {
			assertEquals(681.45, crypto.computePrice(), 0.0001);
		} catch (CryptoSupportedException e) {
			System.out.println(e.getMessage());
		} catch (InvalidVolumeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testXRP() {
		Crypto crypto= new Crypto(Coins.XRP, 7.50, 9, "0.63%");
		try {
			assertEquals(2.853, crypto.computePrice(), 0.0001);
		} catch (CryptoSupportedException e) {
			System.out.println(e.getMessage());
		} catch (InvalidVolumeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testEOS() {
		Crypto crypto= new Crypto(Coins.EOS, 1.93, 6, "0.97%");
		try {
			assertEquals(24, crypto.computePrice(), 0.0001);
		} catch (CryptoSupportedException e) {
			System.out.println(e.getMessage());
		} catch (InvalidVolumeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testLTC() {
		Crypto crypto= new Crypto(Coins.LTC, 1.79, 4, "-1.82%");
		try {
			try {
				assertEquals(223.92, crypto.computePrice(), 0.0001);
			} catch (InvalidVolumeException e) {
				System.out.println(e.getMessage());
			}
		} catch (CryptoSupportedException e) {
			System.out.println(e.getMessage());
	}
	}
	@Test
	public void testBCH() {
		Crypto crypto= new Crypto(Coins.BCH, 2.70, 7, "-1.06%");
		try {
			try {
				assertEquals(914.97, crypto.computePrice(), 0.0001);
			} catch (InvalidVolumeException e) {
				System.out.println(e.getMessage());
			}
		} catch (CryptoSupportedException e) {
			System.out.println(e.getMessage());
	}
	}
	@Test
	public void testXML() {
		Crypto crypto= new Crypto(Coins.XML, 2.21, 3, "11.7%");
		try {
			try {
				assertEquals(0.3114, crypto.computePrice(), 0.0001);
			} catch (InvalidVolumeException e) {
				System.out.println(e.getMessage());
			}
		} catch (CryptoSupportedException e) {
			System.out.println(e.getMessage());
	}
	}
	@Test
	public void testTRX() {
		Crypto crypto= new Crypto(Coins.TRX, 1.53, 3, "-0.34%");
		try {
			try {
				assertEquals(0.0678, crypto.computePrice(), 0.0001);
			} catch (InvalidVolumeException e) {
				System.out.println(e.getMessage());
			}
		} catch (CryptoSupportedException e) {
			System.out.println(e.getMessage());
	}
	}
	@Test
	public void testUSDT() {
		Crypto crypto= new Crypto(Coins.USDT, 8.34, 7, "0.07%");
		try {
			try {
				assertEquals(7.07, crypto.computePrice(), 0.0001);
			} catch (InvalidVolumeException e) {
				System.out.println(e.getMessage());
			}
		} catch (CryptoSupportedException e) {
			System.out.println(e.getMessage());
	}
	}
	@Test
	public void testXMR() {
		Crypto crypto= new Crypto(Coins.XMR, 6.9, 2, "-0.95%");
		try {
			try {
				assertEquals(100.38, crypto.computePrice(), 0.0001);
			} catch (InvalidVolumeException e) {
				System.out.println(e.getMessage());
			}
		} catch (CryptoSupportedException e) {
			System.out.println(e.getMessage());
	}
	}
}

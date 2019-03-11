package ro.ase.cts.model;

import ro.ase.cts.exceptions.CryptoSupportedException;
import ro.ase.cts.exceptions.InvalidVolumeException;

public class Crypto {
	private Coins name;
	private double volume;
	private float units;
	private String change;
	
	
	public Coins getName() {
		return name;
	}

	public void setName(Coins name) {
		this.name = name;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public float getUnits() {
		return units;
	}

	public void setUnits(float units) {
		this.units = units;
	}

	public String getChange() {
		return change;
	}

	public void setChange(String change) {
		this.change = change;
	}

	public Crypto() {
		
	}

	public Crypto(Coins name, double volume, float units, String change) {
		super();
		this.name = name;
		this.volume = volume;
		this.units = units;
		this.change = change;
	}

	public double computePrice() throws CryptoSupportedException, InvalidVolumeException {
		double price=0;
		if(this.volume<0)
			throw new InvalidVolumeException("Volume should be positive!");
		
		switch(this.name) {
			case BITCOIN:
				price= this.units*3903d;
				break;
			case ETHEREUM:
				price= this.units*136.29d;
				break;
			case XRP:
				price= this.units*0.317d;
				break;
			case EOS:
				price= this.units*4d;
				break;
			case LTC:
				price= this.units*55.98d;
				break;
			case BCH:
				price= this.units*130.71d;
				break;
			case XML:
				price= this.units*0.1038d;
				break;
			case TRX:
				price= this.units*0.0226;
				break;
			case USDT:
				price= this.units*1.01d;
				break;
			case XMR:
				price= this.units*50.19d;
				break;
			default:
				throw new CryptoSupportedException("Implement the logic for "+ this.name.toString());
		}
		
		return price;
	}
}

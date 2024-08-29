package com.pratice.DSA.pattern;

import lombok.ToString;

@ToString
public class Computer {

	private String ram;
	private String HDD;
	private boolean isGraphiccardEnabled;
	private boolean isbluetoothEnabled;

	public Computer(ComputerBuilder computerBuilder) {
		this.ram = computerBuilder.ram;
		this.HDD = computerBuilder.HDD;
		this.isGraphiccardEnabled = computerBuilder.isGraphiccardEnabled;
		this.isbluetoothEnabled = computerBuilder.isbluetoothEnabled;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHDD() {
		return HDD;
	}

	public void setHDD(String hDD) {
		HDD = hDD;
	}

	public boolean isGraphiccardEnabled() {
		return isGraphiccardEnabled;
	}

	public void setGraphiccardEnabled(boolean isGraphiccardEnabled) {
		this.isGraphiccardEnabled = isGraphiccardEnabled;
	}

	public boolean isIsbluetoothEnabled() {
		return isbluetoothEnabled;
	}

	public void setIsbluetoothEnabled(boolean isbluetoothEnabled) {
		this.isbluetoothEnabled = isbluetoothEnabled;
	}

	
	public static class ComputerBuilder {
		private String ram;
		private String HDD;
		private boolean isGraphiccardEnabled;
		private boolean isbluetoothEnabled;

		public ComputerBuilder Ram(String ram) {
			this.ram = ram;
			return this;
		}

		public ComputerBuilder HDD(String HDD) {
			this.HDD = HDD;
			return this;
		}

		public ComputerBuilder IsGraphiccardEnabled(boolean isGraphiccardEnabled) {
			this.isGraphiccardEnabled = isGraphiccardEnabled;
			return this;
		}

		public ComputerBuilder IsBluetoothEnabled(boolean isbluetoothEnabled) {
			this.isbluetoothEnabled = isbluetoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}

	public static void main(String args[]) {
		Computer computer = new Computer.ComputerBuilder().Ram("16 GB").IsBluetoothEnabled(true)
				.IsGraphiccardEnabled(false).build();

		System.out.println(computer);
	}
}

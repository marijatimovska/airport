package com.iwec.airplane.file.menager;

import com.iwec.airport.model.DataAirplane;

public class FWReader extends FileMenagerImpl<DataAirplane> {

	@Override
	public DataAirplane createInstance(String line) {

		if (line == null || line.isEmpty()) {
			return null;
		}
		
		DataAirplane st = new DataAirplane();

		st.setId(Integer.parseInt(line.substring(0, 2).trim()));
		st.setSeats(Integer.parseInt(line.substring(3, 6).trim()));
		st.setCapacity(Double.parseDouble(line.substring(6, 11)));

		return st;

	}

}

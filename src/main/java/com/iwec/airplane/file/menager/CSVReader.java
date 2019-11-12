package com.iwec.airplane.file.menager;

import java.util.List;

import com.iwec.airport.model.Airplane;
import com.iwec.airport.model.DataAirplane;

public class CSVReader extends FileMenagerImpl<Airplane> {
	public static final String SOURCE = "stats.txt";

	@Override
	public Airplane createInstance(String line) {

		if (line == null || line.isEmpty()) {
			return null;
		}

		String[] tokens = line.split(",");

		if (tokens.length != 5) {
			return null;
		}

		DataAirplane data = createStats(tokens);

		return new Airplane(Integer.parseInt(tokens[0].trim()), tokens[1].trim(), tokens[2].trim(),
				Integer.parseInt(tokens[3].trim()), Double.parseDouble(tokens[4].trim()), data);
	}

	private DataAirplane createStats(String[] tokens) {
		FileMenager<DataAirplane> readerFW = new FWReader();
		List<DataAirplane> list = readerFW.read(SOURCE);
		DataAirplane data = new DataAirplane();

		for (DataAirplane stats : list) {
			if (stats.getId().equals(Integer.parseInt(tokens[0].trim()))) {
				data = stats;
			}
		}

		return data;
	}

}

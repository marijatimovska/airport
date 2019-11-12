package com.iwec.airplane.file.menager.map;

import java.util.HashMap;
import java.util.Map;

import com.iwec.airport.model.Airplane;

public class CSVReaderMap extends ReaderMapImpl<Integer, Airplane> {

	@Override
	protected Map<Integer, Airplane> createInstance(String line) {
		Map<Integer, Airplane> map = new HashMap<>();
		
		if (line == null || line.isEmpty()) {
			return null;
		}

		String[] tokens = line.split(",");

		if (tokens.length != 5) {
			return null;
		}
		Airplane a = new Airplane(Integer.parseInt(tokens[0].trim()), tokens[1].trim(), tokens[2].trim(),
				Integer.parseInt(tokens[3].trim()), Double.parseDouble(tokens[4].trim()), null);
		
		map.put(a.getId(), a);
		
		return map;
	}

}

package com.iwec.airport;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.iwec.airplane.file.menager.CSVReader;
import com.iwec.airplane.file.menager.FileMenager;
import com.iwec.airplane.file.menager.map.CSVReaderMap;
import com.iwec.airplane.file.menager.map.ReaderMap;
import com.iwec.airport.model.Airplane;

public class App {
	public static final String SOURCE = "stats.txt";
	public static final String SOURCEB = "airplanes.csv";

	public static void main(String[] args) {

		FileMenager<Airplane> readerCSV = new CSVReader();
		List<Airplane> listCSV = readerCSV.read(SOURCEB);
		for (Airplane i : listCSV) {
			System.out.println(i);
		}
		
		ReaderMap<Integer,Airplane> ai = new CSVReaderMap();
		Map<Integer,Airplane> map = ai.read(SOURCEB);
		
		
		Set<Map.Entry<Integer,Airplane>> set = map.entrySet();
		for (Entry<Integer, Airplane> it : set) {
			System.out.println(it);
			//set.stream().forEach(System.out:: print);
		}
		
		
	}

}

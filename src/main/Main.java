package main;
import java.util.ArrayList;
import java.util.Iterator;

import model.*;

public class Main {
	
	/*
	 * Code here
	 * */
	public static ArrayList<Worker> workers = new ArrayList<Worker>();
	
	public static void trigger(Worker w){
		/*
		 * Code here
		 * */
		if (w instanceof QualityChecker) ((QualityChecker)w).increaseStress();
	}
	
	public static void produce(){
		/*
		 * Code here
		 * */
		Iterator<Worker> it = workers.iterator();
		while (it.hasNext()) {
			Worker s = it.next();
			s.work();
			if (s instanceof QualityChecker) ((QualityChecker) s).increaseStress();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bot A = new MaterialProcessor();
		Bot B = new ProductAssembler();
		Bot C = new Packager();
		QualityChecker D= new QualityChecker();
		QualityChecker E= new QualityChecker();
		
		workers.add(A);workers.add(B);workers.add(C);workers.add(D);workers.add(E);
		
		while(Bot.material>0){
			produce();
		}
		System.out.println("Total Product today =" + Bot.finishedProduct);
		
	}

}

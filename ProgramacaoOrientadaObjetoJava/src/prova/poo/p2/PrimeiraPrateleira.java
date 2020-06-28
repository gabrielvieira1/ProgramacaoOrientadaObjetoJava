package prova.poo.p2;

import java.util.Iterator;
import java.util.TreeSet;

public class PrimeiraPrateleira {

	public static void main(String[] args) {
		TreeSet<Integer> i = new TreeSet<Integer>();
		TreeSet<Mercadoria> m =new TreeSet<Mercadoria>();
		m.add(new Mercadoria(53));
		m.add(new Mercadoria(101));
		m.add(new Mercadoria(10));
		m.add(new Mercadoria(24));
		m.add(new Mercadoria(62));
		i.add(1);
		i.add(2);
		i.add(1);
		System.out.println(m.size() + " " + i.size());
		
		Iterator<Mercadoria> iterator = m.iterator();
		System.out.println("Elementos do TreeSet: ");
		while (iterator.hasNext()) {
			System.out.println(iterator.next()+ " ");
		}
		System.out.println();
	}

}

package com.eclipsetotale.tutorial.horloge.nebula;

import org.eclipse.swt.widgets.Composite;

import com.eclipsetotale.tutorial.horloge.Horloge;

public class HorlogeNebulaImpl implements Horloge {

	public HorlogeNebulaImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afficher(Composite parent) {
		new HorlogeNebula(parent);

	}

}

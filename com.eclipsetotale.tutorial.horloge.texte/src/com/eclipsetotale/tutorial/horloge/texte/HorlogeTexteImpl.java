/**
 * 
 */
package com.eclipsetotale.tutorial.horloge.texte;

import org.eclipse.swt.widgets.Composite;

import com.eclipsetotale.tutorial.horloge.Horloge;

/**
 * @author benji
 * 
 */
public class HorlogeTexteImpl implements Horloge {

	/**
	 * 
	 */
	public HorlogeTexteImpl() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.eclipsetotale.tutorial.horloge.Horloge#afficher(org.eclipse.swt.widgets
	 * .Composite)
	 */
	@Override
	public void afficher(Composite parent) {
		new HorlogeTexte(parent);

	}

}

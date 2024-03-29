package com.eclipsetotale.tutorial.horloge.texte;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

public class HorlogeTexte {
	private Font font;
	private Label heureLabel;
	boolean isVisible = true;

	public HorlogeTexte(final Composite parent) {
		final Display display = parent.getDisplay();
		parent.setLayout(new FillLayout());

		heureLabel = new Label(parent, SWT.CENTER);
		heureLabel.setForeground(display.getSystemColor(SWT.COLOR_DARK_BLUE));
		heureLabel.setFont(this.getFont(parent));

		final Runnable updateUIRunnable = new Runnable() {
			public void run() {
				try {
					if (parent.isVisible()) {
						SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
						String date = sdf.format(new Date());
						heureLabel.setText(date);
					}
				} catch (Throwable e) {
					isVisible = false;
					dispose();
				}
			}
		};

		Thread thread = new Thread(new Runnable() {
			public void run() {
				while (isVisible) {
					display.asyncExec(updateUIRunnable);
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		thread.start();
	}

	private Font getFont(Composite parent) {
		if (font == null) {
			font = JFaceResources.getDefaultFont();
			FontData fdata = font.getFontData()[0];
			fdata.setHeight(18);
			fdata.setStyle(SWT.BOLD);
			font = new Font(parent.getDisplay(), fdata);
		}
		return font;
	}

	public void dispose() {
		font.dispose();
	}

}
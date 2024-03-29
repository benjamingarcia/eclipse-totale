package com.eclipsetototale.tutorial.premierplugin.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import com.eclipsetotale.tutorial.horloge.nebula.HorlogeNebula;

/**
 * Our sample action implements workbench action delegate. The action proxy will
 * be created by the workbench and shown in the UI. When the user tries to use
 * the action, this delegate will be created and execution will be delegated to
 * it.
 * 
 * @see IWorkbenchWindowActionDelegate
 */
public class SampleAction implements IWorkbenchWindowActionDelegate {
	/**
	 * The constructor.
	 */
	public SampleAction() {
	}

	/**
	 * The action has been activated. The argument of the method represents the
	 * 'real' action sitting in the workbench UI.
	 * 
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	public void run(IAction action) {
		// TODO : tuto 1
		// MessageDialog.openInformation(
		// window.getShell(),
		// "Premierplugin",
		// "Hello, Eclipse world");
		// TODO : tuto 2
		// Display display = Display.getCurrent();
		// Shell fenetre = new Shell(display, SWT.SHELL_TRIM | SWT.TOOL);
		// fenetre.setSize(200, 55);
		// new HorlogeTexte(fenetre);
		// fenetre.open();
		// TODO : tuto 3
		Display display = Display.getCurrent();
		Shell fenetre = new Shell(display, SWT.SHELL_TRIM | SWT.TOOL);
		fenetre.setSize(220, 240);
		new HorlogeNebula(fenetre);
		fenetre.open();
	}

	/**
	 * Selection in the workbench has been changed. We can change the state of
	 * the 'real' action here if we want, but this can only happen after the
	 * delegate has been created.
	 * 
	 * @see IWorkbenchWindowActionDelegate#selectionChanged
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

	/**
	 * We can use this method to dispose of any system resources we previously
	 * allocated.
	 * 
	 * @see IWorkbenchWindowActionDelegate#dispose
	 */
	public void dispose() {
	}

	/**
	 * We will cache window object in order to be able to provide parent shell
	 * for the message dialog.
	 * 
	 * @see IWorkbenchWindowActionDelegate#init
	 */
	public void init(IWorkbenchWindow window) {
	}
}
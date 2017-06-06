package org.helloworldmvc.main;

import org.helloworldmvc.Contract.IModel;
import org.helloworldmvc.Contract.IView;
import org.helloworldmvc.controller.Controller;
import org.helloworldmvc.model.Model;
import org.helloworldmvc.view.View;

public class main {
	public static void main(final String[] args) {
		final IModel model = new Model();
		final IView view = new View();
		final Controller controller = new Controller(view, model);

	}

}
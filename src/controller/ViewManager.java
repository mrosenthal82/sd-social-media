package controller;

import java.awt.CardLayout;
import java.awt.Container;

import model.User;
import view.LoginView;
import view.ProfileView;

public class ViewManager {
	
	private static ViewManager manager;
	private Container views;
	
	private ViewManager(Container views) {
        this.views = views;
    }
	
	public static ViewManager getInstance(Container views) {
        if (manager == null) {
            manager = new ViewManager(views);
        }
        return manager;
    }
	
	public void switchTo(String view) {
        ((CardLayout) views.getLayout()).show(views, view);
    }
}
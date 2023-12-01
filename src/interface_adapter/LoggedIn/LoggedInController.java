package interface_adapter.LoggedIn;

import interface_adapter.ViewManagerModel;
import view.SignupView;

public class LoggedInController {
    private final LoggedInViewModel loggedInViewModel;
    private final ViewManagerModel viewManagerModel;

    public LoggedInController(LoggedInViewModel loggedInViewModel, ViewManagerModel viewManagerModel) {
        this.loggedInViewModel = loggedInViewModel;
        this.viewManagerModel = viewManagerModel;
    }

    public void logout() {
        LoggedInState currentState = loggedInViewModel.getState();
        currentState.setUsername(null);
        loggedInViewModel.firePropertyChanged();
        viewManagerModel.setActiveView("sign up");
        viewManagerModel.firePropertyChanged();
    }
}

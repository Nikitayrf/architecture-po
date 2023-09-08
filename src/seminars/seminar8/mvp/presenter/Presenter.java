/*
package seminars.seminar8.mvp.presenter;

import seminars.seminar8.mvp.model.Model;
import seminars.seminar8.mvp.view.View;

public class Presenter {
    private View viewContract;
    private final Model model;

    public Presenter(Model model) {
        this.model = model;
    }

    public void attachView(ViewContract viewContract) {
        this.viewContract = viewContract;
    }

    public void loadStudents() {
        viewContract.showStudents( model.getRemoteStudents() );
        viewContract.showSeparator();
    }

    public void getLocalStudents() {
        viewContract.showStudents( model.getLocalStudents() );
        viewContract.showSeparator();
    }
}
*/
/*
package seminars.seminar8.mvvm.view;

import seminars.seminar8.mvvm.model.Model;

public class AppViewModel extends ViewModel {
    private final Model model = new Model();
    private final MutableLiveData<List<Student>> students = new MutableLiveData<>();
    private final MutableLiveData<Integer> studentsListNumber = new
            MutableLiveData<>( model.getListNumber() );

    public LiveData<List<Student>> studentsLiveData() {
        return students;
    }

    public LiveData<Integer> listNumberLiveData() {
        return studentsListNumber;
    }

    public void updateData() {
        model.updateListNumber();
        studentsListNumber.postValue( model.getListNumber() );
        students.postValue( model.getData() );
    }
}
*/

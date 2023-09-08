/*
package seminars.seminar8.mvvm.viewmode;

import seminars.seminar8.mvvm.view.AppViewModel;

public class MainActivity extends AppCompatActivity {
    private AppViewModel viewModel;
    private ActivityMainBinding binding;
    private StudentArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        binding = ActivityMainBinding.inflate( getLayoutInflater() );
        View root = binding.getRoot();
        viewModel = new ViewModelProvider( this ).get( AppViewModel.class );
        initAdapter();
        initButton();
        initObserver();
        initListNumber();
        setContentView( root );
    }

    private void initAdapter() {
        adapter = new StudentArrayAdapter( this );
        binding.studentList.setAdapter( adapter );
    }

    private void initButton() {
        binding.updateList.setOnClickListener( view -> viewModel.updateData() );
    }

    private void initObserver() {
        viewModel.studentsLiveData().observe( this, studentList -> {
            adapter.clear();
            adapter.addAll( studentList );
            adapter.notifyDataSetChanged();
        } );
    }

    private void initListNumber() {
        viewModel.listNumberLiveData().observe( this, number ->
                binding.listNumber.setText( getString( R.string.list_number, number ) )
        );
    }
}
*/

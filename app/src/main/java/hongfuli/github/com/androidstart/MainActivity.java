package hongfuli.github.com.androidstart;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.course_list_view);
        listView.setDividerHeight(20);
        listView.setAdapter(new CourseListAdapter());

    }
}

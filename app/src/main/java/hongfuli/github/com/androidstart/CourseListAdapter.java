package hongfuli.github.com.androidstart;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by lihongfu on 17/9/6.
 */

public class CourseListAdapter extends BaseAdapter {

    private long id;
    private Node[] data = {new Node(ImageViewCourseActivity.class, "ImageView画图"), new Node(SurfaceViewCourseActivity.class, "SurfaceView画图")};


    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return ((Node) getItem(position)).id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_course_list_item_view, parent, false);
        }

        TextView idView = (TextView) convertView.findViewById(R.id.id);
        TextView nameView = (TextView) convertView.findViewById(R.id.name);

        final Node n = (Node) getItem(position);
        idView.setText(String.valueOf(n.id));
        nameView.setText(n.name);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), n.target);
                v.getContext().startActivity(intent);
            }
        });

        return convertView;
    }


    public class Node {
        public long id;
        public Class<? extends Activity> target;
        public String name;

        public Node(Class<? extends Activity> target, String name) {
            this.id = CourseListAdapter.this.id;
            CourseListAdapter.this.id += 1;
            this.target = target;
            this.name = name;
        }
    }
}

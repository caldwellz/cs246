package site.zachc.prove_06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
  protected final static String FILENAME = "numbers.txt";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  protected void onBtnCreate(View view) {
    // Pass a simple list of 1-10
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    new CreateFileTask().execute(new Pair<List<Integer>, String>(nums, FILENAME));
  }

  protected void onBtnLoad(View view) {
    new LoadFileTask().execute();
  }

  protected void onBtnClear(View view) {

  }
}

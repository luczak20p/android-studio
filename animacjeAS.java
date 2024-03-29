// =============================simple==================
public class MainActivity extends AppCompatActivity {

    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = (ImageView) findViewById(R.id.imageView2);
        startanim();
    }

    private void startanim() {
        Animation alpha = new AlphaAnimation(1f,0f);
        alpha.setDuration(4000);
        alpha.setRepeatCount(1);
        logo.startAnimation(alpha);
    }
}

// ==========================intermediate=========================
// public class MainActivity extends AppCompatActivity {

//     ImageView logo;

//     @Override
//     protected void onCreate(Bundle savedInstanceState) {
//         super.onCreate(savedInstanceState);
//         setContentView(R.layout.activity_main);

//         logo = (ImageView) findViewById(R.id.imageView2);
//         startanim();
//     }

//     private void startanim() {
//         Animation out = new AlphaAnimation(1f,0f);
//         out.setDuration(4000);
//         final Animation in = new AlphaAnimation(0f,1f);
//         in.setDuration(4000);
//         out.setAnimationListener(new Animation.AnimationListener() {
//             @Override
//             public void onAnimationStart(Animation animation) {
//                 Toast.makeText(MainActivity.this,"Starten",Toast.LENGTH_SHORT).show();
//             }

//             @Override
//             public void onAnimationEnd(Animation animation) {
//                 logo.startAnimation(in);
//             }

//             @Override
//             public void onAnimationRepeat(Animation animation) {

//             }
//         });
//         in.setAnimationListener(new Animation.AnimationListener() {
//             @Override
//             public void onAnimationStart(Animation animation) {
//                 Toast.makeText(MainActivity.this,"Starten2",Toast.LENGTH_SHORT).show();
//             }

//             @Override
//             public void onAnimationEnd(Animation animation) {
//                 logo.startAnimation(out);
//             }

//             @Override
//             public void onAnimationRepeat(Animation animation) {

//             }
//         });

//         logo.startAnimation(out);
//     }
// }
// =========================================================================

// public class MainActivity extends AppCompatActivity {

//     ImageView logo;

//     @Override
//     protected void onCreate(Bundle savedInstanceState) {
//         super.onCreate(savedInstanceState);
//         setContentView(R.layout.activity_main);

//         logo = (ImageView) findViewById(R.id.imageView2);
//         startanim();
//     }

//     private void startanim() {
//        Animation scale = new ScaleAnimation(1f,1.5f,1f,1.5f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
//        scale.setDuration(5000);
//        scale.setFillAfter(true); //zostaje obrazek po animacji
//        logo.startAnimation(scale);
//     }
// }
// ======================================================================
       // Animation scale = new RotateAnimation(0,360,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);

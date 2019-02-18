package mm.com.mymainactivity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

import mm.com.mymainactivity.MainActivityFragments.Page1;
import mm.com.mymainactivity.MainActivityFragments.Page2;
import mm.com.mymainactivity.MainActivityFragments.Page3;

public class MainActivity extends AppCompatActivity {

    MyViewPageAdapter adapter;
    TabLayout tabLayout;
    ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.MyTabs);
        viewPager = (ViewPager) findViewById(R.id.MyPager);



        adapter = new MyViewPageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(adapter.getCount()-2);
        tabLayout.setupWithViewPager(viewPager);



        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if(viewPager.getCurrentItem() == 0){



                }else if(tab.getPosition()==0){

                }else if(tab.getPosition()==2){

                }

            }


            @Override
            public void onTabUnselected(TabLayout.Tab tab) {


            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {


            }
        });




    }


    @Override
    protected void onStart() {
        super.onStart();

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float v, int i1) {


                if(position == 1){


                }else if (position == 0){



                }else if (position == 2 ){

                }




            }

            @Override
            public void onPageSelected(int position) {


                if(position == 1) {
                    tabLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorSwitchOnLight));

                    ViewGroup vg = (ViewGroup) tabLayout.getChildAt(0);
                    int tabsCount = vg.getChildCount();
                    for (int i = 0; i < tabsCount; i++) {
                        int delay = (i * 1) + 10; //this is starting delay
                        ViewGroup vgTab = (ViewGroup) vg.getChildAt(i);
                        vgTab.setScaleX(5f);
                        vgTab.setScaleY(0f);

                        vgTab.animate()
                                .scaleX(1f)
                                .scaleY(1f)
                                .setStartDelay(delay)
                                .setInterpolator(new LinearOutSlowInInterpolator())
                                .setDuration(450)
                                .start();
                    }


                    tabLayout.getTabAt(1).setIcon(R.drawable.logo_150);
                    tabLayout.getTabAt(2).setIcon(R.drawable.search_icon);
                    tabLayout.getTabAt(0).setIcon(R.drawable.menu_icon);



                }else if (position == 0) {


                    tabLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimary));
                    ViewGroup vg1 = (ViewGroup) tabLayout.getChildAt(0);
                    int tabsCount1 = vg1.getChildCount();
                    for (int i = 0; i < tabsCount1; i++)
                    {
                        int delay = (i * 1) + 10; //this is starting delay
                        ViewGroup vgTab = (ViewGroup) vg1.getChildAt(i);
                        vgTab.setScaleX(5f);
                        vgTab.setScaleY(0f);

                        vgTab.animate()
                                .scaleX(1f)
                                .scaleY(1f)
                                .setInterpolator(new LinearOutSlowInInterpolator())
                                .setStartDelay(delay)
                                .setDuration(450)
                                .start();
                    }

                    tabLayout.getTabAt(1).setIcon(R.drawable.menu_icon);
                    tabLayout.getTabAt(2).setIcon(R.drawable.logo_150);
                    tabLayout.getTabAt(0).setIcon(R.drawable.edit_pencil);


                }
                else if (position == 2) {
                    tabLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimary));

                    ViewGroup vg2 = (ViewGroup) tabLayout.getChildAt(0);
                    int tabsCount2 = vg2.getChildCount();
                    for (int i = 0; i < tabsCount2; i++)
                    {
                        int delay = (i * 1) + 10; //this is starting delay
                        ViewGroup vgTab = (ViewGroup) vg2.getChildAt(i);
                        vgTab.setScaleX(5f);
                        vgTab.setScaleY(0f);

                        vgTab.animate()
                                .scaleX(1f)
                                .scaleY(1f)
                                .setStartDelay(delay)
                                .setInterpolator(new FastOutSlowInInterpolator())
                                .setDuration(450)
                                .start();

                    }

                    tabLayout.getTabAt(0).setIcon(R.drawable.logo_150);
                    tabLayout.getTabAt(1).setIcon(R.drawable.search_icon);
                    tabLayout.getTabAt(2).setIcon(R.color.colorPrimary);
                    tabLayout.getResources().getColor(R.color.colorSwitchOnLight);



                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {


            }
        });


    }










    public class MyViewPageAdapter extends FragmentPagerAdapter {

        private int numOfTabs;

        public MyViewPageAdapter(FragmentManager manager, int numOfTabs) {
            super(manager);
            this.numOfTabs = numOfTabs;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new Page2();
                case 1:
                    return new Page1();
                case 2:
                    return new Page3();
                default:return null;
            }
        }

        @Override
        public int getCount() {
            return numOfTabs;
        }
    }

}

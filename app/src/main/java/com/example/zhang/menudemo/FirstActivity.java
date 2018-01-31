package com.example.zhang.menudemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        //  显示Inten的使用
        findViewById(R.id.btn_to_acTwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //显示启动
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);


                //隐式启动
//                Intent intent = new Intent("HEQIAN");
//                intent.addCategory;("自定义的Category")  //如果你自定义的有Category的话  Category 可以定义多个


                //intent 打开网页
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("http://www.baidu.com"));

                startActivity(intent);
            }
        });
    }

    /***
     *
     * @param menu  系统中的  menu 菜单
     * @return 返回true  表示允许显示   fasle 表示不允许显示出来
     * 如果需要 对菜单项进行监听    需要重写  onOptionsItemSelected()  方法
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /**  第一个参数   和   第二个参数   通过那个资源文件来创建菜单   菜单将添加到那个menu中去
         *  getMenuInflater() 方法会得到 MenuInflater  对象
         * */
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /**
     * @param item MenuItem
     * @return 默认   return super.onOptionsItemSelected(item);
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add:
                //做你自己业务需要做的逻辑
                break;
            case R.id.remove:
                //做你自己业务需要做的逻辑  比如说下面
                /**
                 * 销毁Activity   调用下面方法 直接销毁Activity
                 * 当然点击返回键也是销毁 Activity
                 */
                finish();
                break;
        }
        return true;
    }
}

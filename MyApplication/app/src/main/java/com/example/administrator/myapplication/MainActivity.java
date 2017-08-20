package com.example.administrator.myapplication;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
   public static final String SER_KEY = "book1";
   public static final String SER_TYPE = "book";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick1(View v)
    {
        Intent intent = new Intent(MainActivity.this, ScanActivity.class);
        Bundle bundle = new Bundle();
                // Serializable传递对象
                PersonSer personSer = new PersonSer();
                personSer.setName("zuolong");
                personSer.setAge(26);
                bundle.putSerializable(SER_KEY, personSer);
                intent.putExtra("type", SER_TYPE);
                intent.putExtras(bundle);
                startActivity(intent);
//            case R.id.parcelable_btn:
//                // Parcelable传递对象
//                PersonPar personPar = new PersonPar();
//                personPar.setName("snail");
//                personPar.setAge(27);
//                // Bundle有putParcelableArray和putParcelableArrayList方法，也就可以传递数组和列表
//                bundle.putParcelable(PAR_KEY, personPar);
//                intent.putExtra("type", PAR_TYPE);
//                // Intent也有putParcelableArrayListExtra方法，可以传递实现Parcelable接口的对象列表
//                intent.putExtras(bundle);
//                startActivity(intent);
        }
//
//    @Override
//    public boolean onTouch(View view, MotionEvent motionEvent)
//    {
//        PersonSer book = new PersonSer();
//        book.setNum("123");
//        book.setRead(false);
//        book.setPlace(12);
//        book.setBookname("<<哈尔的移动城堡>>");
//        Bundle bundle = new Bundle();
//        bundle.putParcelable("book", (Parcelable) book);
//        Intent intent = new Intent();
//        intent.putExtra("bound",bundle);
//        intent.setClass(MainActivity.this,ScanActivity.class);
//        startActivity(intent);
//        return false;
}

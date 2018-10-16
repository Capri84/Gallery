package com.example.capri.gallery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.github.abdularis.civ.CircleImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CategoryActivity extends AppCompatActivity {

    @BindView(R.id.all_iv)
    CircleImageView allIv;
    @BindView(R.id.animals_iv)
    CircleImageView animalsIv;
    @BindView(R.id.buildings_iv)
    CircleImageView buildingsIv;
    @BindView(R.id.texture_iv)
    CircleImageView textureIv;
    @BindView(R.id.beauty_iv)
    CircleImageView beautyIv;
    @BindView(R.id.business_iv)
    CircleImageView businessIv;
    @BindView(R.id.communications_iv)
    CircleImageView communicationsIv;
    @BindView(R.id.education_iv)
    CircleImageView educationIv;
    @BindView(R.id.emotions_iv)
    CircleImageView emotionsIv;
    @BindView(R.id.food_iv)
    CircleImageView foodIv;
    @BindView(R.id.health_iv)
    CircleImageView healthIv;
    @BindView(R.id.industry_iv)
    CircleImageView industryIv;
    @BindView(R.id.music_iv)
    CircleImageView musicIv;
    @BindView(R.id.nature_iv)
    CircleImageView natureIv;
    @BindView(R.id.people_iv)
    CircleImageView peopleIv;
    @BindView(R.id.places_iv)
    CircleImageView placesIv;
    @BindView(R.id.religion_iv)
    CircleImageView religionIv;
    @BindView(R.id.science_iv)
    CircleImageView scienceIv;
    @BindView(R.id.sport_iv)
    CircleImageView sportIv;
    @BindView(R.id.transport_iv)
    CircleImageView transportIv;
    @BindView(R.id.travel_iv)
    CircleImageView travelIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.all_iv, R.id.animals_iv, R.id.buildings_iv, R.id.texture_iv, R.id.beauty_iv,
            R.id.business_iv, R.id.communications_iv, R.id.education_iv, R.id.emotions_iv,
            R.id.food_iv, R.id.health_iv, R.id.industry_iv, R.id.music_iv, R.id.nature_iv,
            R.id.people_iv, R.id.places_iv, R.id.religion_iv, R.id.science_iv, R.id.sport_iv,
            R.id.transport_iv, R.id.travel_iv})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.all_iv:

                break;
            case R.id.animals_iv:
                break;
            case R.id.buildings_iv:
                break;
            case R.id.texture_iv:
                break;
            case R.id.beauty_iv:
                break;
            case R.id.business_iv:
                break;
            case R.id.communications_iv:
                break;
            case R.id.education_iv:
                break;
            case R.id.emotions_iv:
                break;
            case R.id.food_iv:
                break;
            case R.id.health_iv:
                break;
            case R.id.industry_iv:
                break;
            case R.id.music_iv:
                break;
            case R.id.nature_iv:
                break;
            case R.id.people_iv:
                break;
            case R.id.places_iv:
                break;
            case R.id.religion_iv:
                break;
            case R.id.science_iv:
                break;
            case R.id.sport_iv:
                break;
            case R.id.transport_iv:
                break;
            case R.id.travel_iv:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}

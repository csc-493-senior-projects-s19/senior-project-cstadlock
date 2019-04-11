package com.tadlockc.ffbearmory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ArmoryPageActivity extends AppCompatActivity
{
    // This is just declaring all the buttons for coding with them below.
    ImageButton imgB_cat_axes;
    ImageButton imgB_cat_bows;
    ImageButton imgB_cat_daggers;
    ImageButton imgB_cat_fists;

    ImageButton imgB_cat_greatswords;
    ImageButton imgB_cat_guns;
    ImageButton imgB_cat_hammers;
    ImageButton imgB_cat_harps;

    ImageButton imgB_cat_katanas;
    ImageButton imgB_cat_maces;
    ImageButton imgB_cat_rods;
    ImageButton imgB_cat_spears;

    ImageButton imgB_cat_staffs;
    ImageButton imgB_cat_swords;
    ImageButton imgB_cat_throwing;
    ImageButton imgB_cat_whips;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armory_page);

        // Axes
        imgB_cat_axes = (ImageButton) findViewById(R.id.imgB_cat_axes);
        imgB_cat_axes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadAxeCategorySelection = new Intent(ArmoryPageActivity.this, AxeCategorySelection.class);
                startActivity(intentLoadAxeCategorySelection);
            }
        });

        // Bows
        imgB_cat_bows = (ImageButton) findViewById(R.id.imgB_cat_bows);
        imgB_cat_bows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadBowCategorySelection = new Intent(ArmoryPageActivity.this, BowCategorySelection.class);
                startActivity(intentLoadBowCategorySelection);
            }
        });

        // Daggers
        imgB_cat_daggers = (ImageButton) findViewById(R.id.imgB_cat_daggers);
        imgB_cat_daggers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadDaggersCategorySelection = new Intent(ArmoryPageActivity.this, DaggersCategorySelection.class);
                startActivity(intentLoadDaggersCategorySelection);
            }
        });

        // Fists
        imgB_cat_fists = (ImageButton) findViewById(R.id.imgB_cat_fists);
        imgB_cat_fists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadFistsCategorySelection = new Intent(ArmoryPageActivity.this, FistsCategorySelection.class);
                startActivity(intentLoadFistsCategorySelection);
            }
        });

        // Great Swords
        imgB_cat_greatswords = (ImageButton) findViewById(R.id.imgB_cat_greatswords);
        imgB_cat_greatswords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadGreatSwordsCategorySelection = new Intent(ArmoryPageActivity.this, GreatSwordsCategorySelection.class);
                startActivity(intentLoadGreatSwordsCategorySelection);
            }
        });

        // Guns
        imgB_cat_guns = (ImageButton) findViewById(R.id.imgB_cat_guns);
        imgB_cat_guns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadGunsCategorySelection = new Intent(ArmoryPageActivity.this, GunsCategorySelection.class);
                startActivity(intentLoadGunsCategorySelection);
            }
        });

        // Hammers
        imgB_cat_hammers = (ImageButton) findViewById(R.id.imgB_cat_hammers);
        imgB_cat_hammers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadHammersCategorySelection = new Intent(ArmoryPageActivity.this, HammersCategorySelection.class);
                startActivity(intentLoadHammersCategorySelection);
            }
        });

        // Harps
        imgB_cat_harps = (ImageButton) findViewById(R.id.imgB_cat_harps);
        imgB_cat_harps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadHarpsCategorySelection = new Intent(ArmoryPageActivity.this, HarpsCategorySelection.class);
                startActivity(intentLoadHarpsCategorySelection);
            }
        });

        // Katanas
        imgB_cat_katanas = (ImageButton) findViewById(R.id.imgB_cat_katanas);
        imgB_cat_katanas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadKatanasCategorySelection = new Intent(ArmoryPageActivity.this, KatanasCategorySelection.class);
                startActivity(intentLoadKatanasCategorySelection);
            }
        });

        // Maces
        imgB_cat_maces = (ImageButton) findViewById(R.id.imgB_cat_maces);
        imgB_cat_maces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadMacesCategorySelection = new Intent(ArmoryPageActivity.this, MacesCategorySelection.class);
                startActivity(intentLoadMacesCategorySelection);
            }
        });

        // Rods
        imgB_cat_rods = (ImageButton) findViewById(R.id.imgB_cat_rods);
        imgB_cat_rods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadRodsCategorySelection = new Intent(ArmoryPageActivity.this, RodsCategorySelection.class);
                startActivity(intentLoadRodsCategorySelection);
            }
        });

        // Spears
        imgB_cat_spears = (ImageButton) findViewById(R.id.imgB_cat_spears);
        imgB_cat_spears.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadSpearsCategorySelection = new Intent(ArmoryPageActivity.this, SpearsCategorySelection.class);
                startActivity(intentLoadSpearsCategorySelection);
            }
        });

        // Staffs
        imgB_cat_staffs = (ImageButton) findViewById(R.id.imgB_cat_staffs);
        imgB_cat_staffs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadStaffsCategorySelection = new Intent(ArmoryPageActivity.this, StaffsCategorySelection.class);
                startActivity(intentLoadStaffsCategorySelection);
            }
        });

        // Swords
        imgB_cat_swords = (ImageButton) findViewById(R.id.imgB_cat_swords);
        imgB_cat_swords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadSwordsCategorySelection = new Intent(ArmoryPageActivity.this, SwordsCategorySelection.class);
                startActivity(intentLoadSwordsCategorySelection);
            }
        });

        // Throwing
        imgB_cat_throwing = (ImageButton) findViewById(R.id.imgB_cat_throwing);
        imgB_cat_throwing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadThrowingCategorySelection = new Intent(ArmoryPageActivity.this, ThrowingCategorySelection.class);
                startActivity(intentLoadThrowingCategorySelection);
            }
        });

        // Whips
        imgB_cat_whips = (ImageButton) findViewById(R.id.imgB_cat_whips);
        imgB_cat_whips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadWhipsCategorySelection = new Intent(ArmoryPageActivity.this, WhipsCategorySelection.class);
                startActivity(intentLoadWhipsCategorySelection);
            }
        });


        // Only Use the following commented out code if you are pulling in the information from the last activity (intent)
        // if (getIntent().hasExtra("com.tadlockc.ffbearmory.SOMETHING")) {

    }
}


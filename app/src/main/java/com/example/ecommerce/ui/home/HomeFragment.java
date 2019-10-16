package com.example.ecommerce.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.ecommerce.MobilesActivity;
import com.example.ecommerce.OffersActivity;
import com.example.ecommerce.R;
import com.mancj.materialsearchbar.MaterialSearchBar;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class HomeFragment extends Fragment
{
    LinearLayout offer,mobile;

    private HomeViewModel homeViewModel;

    private MaterialSearchBar searchBar;
    CarouselView carouselView;
    int[] sampleImages ={R.drawable.banner1,R.drawable.banner2,R.drawable.banner3,R.drawable.banner4,R.drawable.banner5,R.drawable.banner7,};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

       searchBar=root.findViewById(R.id.searchBar);
       carouselView=root.findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);
        offer=root.findViewById(R.id.linear_offer);
        mobile=root.findViewById(R.id.linear_mobile);
        offer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(getActivity(),OffersActivity.class);
                startActivity(intent);

            }
        });

        mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(getActivity(), MobilesActivity.class);
                startActivity(intent);
            }
        });
        return root;
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(final int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                   if (position==0)
                   {
                       Toast.makeText(getActivity(), "Position One Click now:", Toast.LENGTH_SHORT).show();
                   }

                   else
                   {
                       Toast.makeText(getActivity(), "Nothing Select..", Toast.LENGTH_SHORT).show();
                   }

                }
            });
        }
    };

}
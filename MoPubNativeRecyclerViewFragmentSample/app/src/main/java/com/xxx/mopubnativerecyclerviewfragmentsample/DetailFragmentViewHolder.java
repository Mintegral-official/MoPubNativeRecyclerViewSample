// Copyright 2018-2019 Twitter, Inc.
// Licensed under the MoPub SDK License Agreement
// http://www.mopub.com/legal/sdk-license-agreement/

package com.xxx.mopubnativerecyclerviewfragmentsample;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * ViewHolder data object that parses and stores named child Views for sample app DetailFragments,

 */
class DetailFragmentViewHolder {
    @NonNull final TextView mDescriptionView;
    @NonNull final Button mLoadButton;

    @NonNull final TextView mAdUnitIdView;


    /**
     * Internal constructor. Use {@link #fromView(View)} to create instances of this class.
     *
     * @param descriptionView Displays ad full name, e.g. "MoPub Banner Sample"
     * @param adUnitIdView Displays adUnitId
     * @param loadButton Loads an ad. For non-cached ad formats, this will also display the ad

     */
    private DetailFragmentViewHolder(
            @NonNull final TextView descriptionView,
            @NonNull final TextView adUnitIdView,
            @NonNull final Button loadButton) {
        mDescriptionView = descriptionView;
        mAdUnitIdView = adUnitIdView;
        mLoadButton = loadButton;

    }

    static DetailFragmentViewHolder fromView(@NonNull final View view) {
        final TextView descriptionView = view.findViewById(R.id.description);
        final TextView adUnitIdView = view.findViewById(R.id.ad_unit_id);
        final Button loadButton = view.findViewById(R.id.load_button);



        return new DetailFragmentViewHolder(descriptionView,
                adUnitIdView,
                loadButton);
    }
}

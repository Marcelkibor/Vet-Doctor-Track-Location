// Generated by view binder compiler. Do not edit!
package com.example.petvet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.petvet.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class VetNavHeaderBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView tvVetEmail;

  @NonNull
  public final TextView tvVetNameNav;

  @NonNull
  public final ImageView vetImage;

  private VetNavHeaderBinding(@NonNull CardView rootView, @NonNull TextView tvVetEmail,
      @NonNull TextView tvVetNameNav, @NonNull ImageView vetImage) {
    this.rootView = rootView;
    this.tvVetEmail = tvVetEmail;
    this.tvVetNameNav = tvVetNameNav;
    this.vetImage = vetImage;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static VetNavHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static VetNavHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.vet_nav_header, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static VetNavHeaderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tvVetEmail;
      TextView tvVetEmail = ViewBindings.findChildViewById(rootView, id);
      if (tvVetEmail == null) {
        break missingId;
      }

      id = R.id.tvVetNameNav;
      TextView tvVetNameNav = ViewBindings.findChildViewById(rootView, id);
      if (tvVetNameNav == null) {
        break missingId;
      }

      id = R.id.vetImage;
      ImageView vetImage = ViewBindings.findChildViewById(rootView, id);
      if (vetImage == null) {
        break missingId;
      }

      return new VetNavHeaderBinding((CardView) rootView, tvVetEmail, tvVetNameNav, vetImage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
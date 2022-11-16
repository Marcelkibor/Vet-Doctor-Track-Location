// Generated by view binder compiler. Do not edit!
package com.example.petvet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class SelectRegisterBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView btAdminLogin;

  @NonNull
  public final CardView btClientRegister;

  @NonNull
  public final CardView btVetRegister;

  @NonNull
  public final CardView lyDrawer;

  @NonNull
  public final TextView tvGt;

  private SelectRegisterBinding(@NonNull CardView rootView, @NonNull CardView btAdminLogin,
      @NonNull CardView btClientRegister, @NonNull CardView btVetRegister,
      @NonNull CardView lyDrawer, @NonNull TextView tvGt) {
    this.rootView = rootView;
    this.btAdminLogin = btAdminLogin;
    this.btClientRegister = btClientRegister;
    this.btVetRegister = btVetRegister;
    this.lyDrawer = lyDrawer;
    this.tvGt = tvGt;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static SelectRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SelectRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.select_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SelectRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btAdminLogin;
      CardView btAdminLogin = ViewBindings.findChildViewById(rootView, id);
      if (btAdminLogin == null) {
        break missingId;
      }

      id = R.id.btClientRegister;
      CardView btClientRegister = ViewBindings.findChildViewById(rootView, id);
      if (btClientRegister == null) {
        break missingId;
      }

      id = R.id.btVetRegister;
      CardView btVetRegister = ViewBindings.findChildViewById(rootView, id);
      if (btVetRegister == null) {
        break missingId;
      }

      CardView lyDrawer = (CardView) rootView;

      id = R.id.tvGt;
      TextView tvGt = ViewBindings.findChildViewById(rootView, id);
      if (tvGt == null) {
        break missingId;
      }

      return new SelectRegisterBinding((CardView) rootView, btAdminLogin, btClientRegister,
          btVetRegister, lyDrawer, tvGt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
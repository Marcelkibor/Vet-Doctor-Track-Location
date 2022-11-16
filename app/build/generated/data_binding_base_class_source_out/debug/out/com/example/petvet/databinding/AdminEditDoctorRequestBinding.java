// Generated by view binder compiler. Do not edit!
package com.example.petvet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.petvet.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AdminEditDoctorRequestBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final ImageView backArrow;

  @NonNull
  public final MaterialButton btConfirm;

  @NonNull
  public final TextView edDocName;

  @NonNull
  public final TextView edDoctorId;

  @NonNull
  public final TextView edEmail;

  @NonNull
  public final TextView edPhoneNo;

  @NonNull
  public final TextView edTime;

  @NonNull
  public final RadioButton radioBtnAccept;

  @NonNull
  public final RadioButton radioBtnDecline;

  @NonNull
  public final RadioGroup radioGroup;

  @NonNull
  public final MaterialToolbar toolBar;

  @NonNull
  public final TextView tvDoctorId;

  @NonNull
  public final TextView tvFirstName;

  @NonNull
  public final TextView tvHeaderSelect;

  @NonNull
  public final TextView tvPhone;

  @NonNull
  public final TextView tvRequestedTime;

  @NonNull
  public final TextView tvServiceName;

  @NonNull
  public final TextView tvVetEmail;

  private AdminEditDoctorRequestBinding(@NonNull DrawerLayout rootView,
      @NonNull ImageView backArrow, @NonNull MaterialButton btConfirm, @NonNull TextView edDocName,
      @NonNull TextView edDoctorId, @NonNull TextView edEmail, @NonNull TextView edPhoneNo,
      @NonNull TextView edTime, @NonNull RadioButton radioBtnAccept,
      @NonNull RadioButton radioBtnDecline, @NonNull RadioGroup radioGroup,
      @NonNull MaterialToolbar toolBar, @NonNull TextView tvDoctorId, @NonNull TextView tvFirstName,
      @NonNull TextView tvHeaderSelect, @NonNull TextView tvPhone,
      @NonNull TextView tvRequestedTime, @NonNull TextView tvServiceName,
      @NonNull TextView tvVetEmail) {
    this.rootView = rootView;
    this.backArrow = backArrow;
    this.btConfirm = btConfirm;
    this.edDocName = edDocName;
    this.edDoctorId = edDoctorId;
    this.edEmail = edEmail;
    this.edPhoneNo = edPhoneNo;
    this.edTime = edTime;
    this.radioBtnAccept = radioBtnAccept;
    this.radioBtnDecline = radioBtnDecline;
    this.radioGroup = radioGroup;
    this.toolBar = toolBar;
    this.tvDoctorId = tvDoctorId;
    this.tvFirstName = tvFirstName;
    this.tvHeaderSelect = tvHeaderSelect;
    this.tvPhone = tvPhone;
    this.tvRequestedTime = tvRequestedTime;
    this.tvServiceName = tvServiceName;
    this.tvVetEmail = tvVetEmail;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AdminEditDoctorRequestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AdminEditDoctorRequestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.admin_edit_doctor_request, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AdminEditDoctorRequestBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backArrow;
      ImageView backArrow = ViewBindings.findChildViewById(rootView, id);
      if (backArrow == null) {
        break missingId;
      }

      id = R.id.btConfirm;
      MaterialButton btConfirm = ViewBindings.findChildViewById(rootView, id);
      if (btConfirm == null) {
        break missingId;
      }

      id = R.id.edDocName;
      TextView edDocName = ViewBindings.findChildViewById(rootView, id);
      if (edDocName == null) {
        break missingId;
      }

      id = R.id.edDoctorId;
      TextView edDoctorId = ViewBindings.findChildViewById(rootView, id);
      if (edDoctorId == null) {
        break missingId;
      }

      id = R.id.edEmail;
      TextView edEmail = ViewBindings.findChildViewById(rootView, id);
      if (edEmail == null) {
        break missingId;
      }

      id = R.id.edPhoneNo;
      TextView edPhoneNo = ViewBindings.findChildViewById(rootView, id);
      if (edPhoneNo == null) {
        break missingId;
      }

      id = R.id.edTime;
      TextView edTime = ViewBindings.findChildViewById(rootView, id);
      if (edTime == null) {
        break missingId;
      }

      id = R.id.radioBtnAccept;
      RadioButton radioBtnAccept = ViewBindings.findChildViewById(rootView, id);
      if (radioBtnAccept == null) {
        break missingId;
      }

      id = R.id.radioBtnDecline;
      RadioButton radioBtnDecline = ViewBindings.findChildViewById(rootView, id);
      if (radioBtnDecline == null) {
        break missingId;
      }

      id = R.id.radioGroup;
      RadioGroup radioGroup = ViewBindings.findChildViewById(rootView, id);
      if (radioGroup == null) {
        break missingId;
      }

      id = R.id.toolBar;
      MaterialToolbar toolBar = ViewBindings.findChildViewById(rootView, id);
      if (toolBar == null) {
        break missingId;
      }

      id = R.id.tvDoctorId;
      TextView tvDoctorId = ViewBindings.findChildViewById(rootView, id);
      if (tvDoctorId == null) {
        break missingId;
      }

      id = R.id.tvFirstName;
      TextView tvFirstName = ViewBindings.findChildViewById(rootView, id);
      if (tvFirstName == null) {
        break missingId;
      }

      id = R.id.tvHeaderSelect;
      TextView tvHeaderSelect = ViewBindings.findChildViewById(rootView, id);
      if (tvHeaderSelect == null) {
        break missingId;
      }

      id = R.id.tvPhone;
      TextView tvPhone = ViewBindings.findChildViewById(rootView, id);
      if (tvPhone == null) {
        break missingId;
      }

      id = R.id.tvRequestedTime;
      TextView tvRequestedTime = ViewBindings.findChildViewById(rootView, id);
      if (tvRequestedTime == null) {
        break missingId;
      }

      id = R.id.tvServiceName;
      TextView tvServiceName = ViewBindings.findChildViewById(rootView, id);
      if (tvServiceName == null) {
        break missingId;
      }

      id = R.id.tvVetEmail;
      TextView tvVetEmail = ViewBindings.findChildViewById(rootView, id);
      if (tvVetEmail == null) {
        break missingId;
      }

      return new AdminEditDoctorRequestBinding((DrawerLayout) rootView, backArrow, btConfirm,
          edDocName, edDoctorId, edEmail, edPhoneNo, edTime, radioBtnAccept, radioBtnDecline,
          radioGroup, toolBar, tvDoctorId, tvFirstName, tvHeaderSelect, tvPhone, tvRequestedTime,
          tvServiceName, tvVetEmail);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
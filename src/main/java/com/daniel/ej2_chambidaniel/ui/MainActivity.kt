package com.daniel.ej2_chambidaniel.ui

import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.result.ActivityResultLauncher
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.daniel.ej2_chambidaniel.R
import com.daniel.ej2_chambidaniel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var openCameraLauncher : ActivityResultLauncher<Intent>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.btnFoto.setOnClickListener {
//            if (permissionValidated()){
//                takePicture()
//            }
//        }
//        openCameraLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){result ->
//
//        if (result.resultCode== RESULT_OK){
//            val photo = result.data?.extras?.get("data") as Bitmap
//            binding.imgPhoto.setImageBitmap(photo)
//        }
        //  }
        val navHostFragment= supportFragmentManager.findFragmentById(R.id.fcv_salva) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bnvMenu.setupWithNavController(navController)


//        binding.btnMapa.setOnClickListener {
//            /*val addressUri = Uri.parse("geo:0,0?q=-11.9951669,-77.0955696")
//            val intent = Intent(Intent.ACTION_VIEW, addressUri)
//            intent.setPackage("com.google.android .apps.maps")
//            intent.resolveActivity(packageManager).let {
//                startActivity(intent)
//            }*/
//            startActivity(Intent(this, AddAddressActivity::class.java))
//        }
    }

    private fun takePicture() {
        val intent = Intent()
        intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE)
        openCameraLauncher.launch(intent)
    }

    private fun permissionValidated(): Boolean {

        val cameraPermission = ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA)
        val permissionList : MutableList<String> = mutableListOf()
        if (cameraPermission!=PackageManager.PERMISSION_GRANTED){
            permissionList.add(android.Manifest.permission.CAMERA)
        }
        if (permissionList.isNotEmpty()){
            ActivityCompat.requestPermissions(this, permissionList.toTypedArray(),1000)
            return false
        }

        return true
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when(requestCode){
            1000 -> {
                if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA)== PackageManager.PERMISSION_GRANTED){
                    takePicture()
                }
            }
        }
    }



}
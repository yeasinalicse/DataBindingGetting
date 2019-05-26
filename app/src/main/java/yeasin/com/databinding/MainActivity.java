package yeasin.com.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import yeasin.com.databinding.databinding.ActivityMainBinding;
import yeasin.com.databinding.models.Product;
import yeasin.com.databinding.util.Products;

public class MainActivity extends AppCompatActivity {
    //data binding
    ActivityMainBinding binding;
    //vars
    private Product mProduct;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        Products products = new Products();
        binding.setProduct(products.PRODUCTS[0]);
    }
}

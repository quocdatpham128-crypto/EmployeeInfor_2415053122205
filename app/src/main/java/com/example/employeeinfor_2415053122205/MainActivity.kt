package com.example.employeeinfor_2415053122205

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.employeeinfor_2415053122205.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nhanVienDoiTuong = NhanVien(
            maNhanVien = "NV2415053122205",
            hoTen = "Phạm Quốc Đạt",
            phongBan = "Công nghệ Thông tin",
            tuoi = 20,
            luong = 16000000.0,
            gioiTinh = "Nam",
            thamNien = 3,
            chucVu = "Lập trình viên Android"
        )

        val luongChuanMoiThang = 10000000.0

        binding.tvMaNhanVien.text = "Mã NV: ${nhanVienDoiTuong.maNhanVien}"
        binding.tvHoTen.text = "Họ tên: ${nhanVienDoiTuong.layTenVietHoa()}"
        binding.tvPhongBan.text = "Phòng ban: ${nhanVienDoiTuong.phongBan}"
        binding.tvChucVu.text = "Chức vụ: ${nhanVienDoiTuong.chucVu}"
        binding.tvTuoi.text = "Tuổi: ${nhanVienDoiTuong.tuoi}"
        binding.tvGioiTinh.text = "Giới tính: ${nhanVienDoiTuong.gioiTinh}"
        binding.tvThamNien.text = "Thâm niên: ${nhanVienDoiTuong.thamNien} năm"
        binding.tvXepLoai.text = "Xếp loại thâm niên: ${nhanVienDoiTuong.layXepLoaiThamNien()}"
        binding.tvLuongDinhDang.text = "Lương hàng tháng: ${nhanVienDoiTuong.layDinhDangLuong()}"
        binding.tvSoSanhLuong.text = "So với lương chuẩn: ${nhanVienDoiTuong.layThongTinLuongChuan(luongChuanMoiThang)}"
        binding.tvThongTinExtension.text = "Thông tin tóm tắt: ${nhanVienDoiTuong.layThongTinTomTat()}"
    }
}
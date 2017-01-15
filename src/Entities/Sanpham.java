package Entities;
// Generated Jan 11, 2017 11:39:30 PM by Hibernate Tools 5.2.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sanpham generated by hbm2java
 */
@Entity
@Table(name = "sanpham", catalog = "qlbantuisach")
public class Sanpham implements Comparable<Sanpham> {

	private Integer maSanPham;

	private int maLoai;

	private int maNhaSanXuat;

	private String tenSanPham;

	private long giaBan;

	private String moTa;

	private String anhBia;

	private Date ngayCapNhap;

	private int soLuongTon;

	private boolean gioiTinh;

	public Sanpham() {
	}

	public Sanpham(int maLoai, int maNhaSanXuat, String tenSanPham, long giaBan, String moTa, String anhBia,
			Date ngayCapNhap, int soLuongTon, boolean gioiTinh) {
		this.maLoai = maLoai;
		this.maNhaSanXuat = maNhaSanXuat;
		this.tenSanPham = tenSanPham;
		this.giaBan = giaBan;
		this.moTa = moTa;
		this.anhBia = anhBia;
		this.ngayCapNhap = ngayCapNhap;
		this.soLuongTon = soLuongTon;
		this.gioiTinh = gioiTinh;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "MaSanPham", unique = true, nullable = false)
	public Integer getMaSanPham() {
		return this.maSanPham;
	}

	public void setMaSanPham(Integer maSanPham) {
		this.maSanPham = maSanPham;
	}

	@Column(name = "MaLoai", nullable = false)
	public int getMaLoai() {
		return this.maLoai;
	}

	public void setMaLoai(int maLoai) {
		this.maLoai = maLoai;
	}

	@Column(name = "MaNhaSanXuat", nullable = false)
	public int getMaNhaSanXuat() {
		return this.maNhaSanXuat;
	}

	public void setMaNhaSanXuat(int maNhaSanXuat) {
		this.maNhaSanXuat = maNhaSanXuat;
	}

	@Column(name = "TenSanPham", nullable = false, length = 100)
	public String getTenSanPham() {
		return this.tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	@Column(name = "GiaBan", nullable = false, precision = 18, scale = 0)
	public long getGiaBan() {
		return this.giaBan;
	}

	public void setGiaBan(long giaBan) {
		this.giaBan = giaBan;
	}

	@Column(name = "MoTa", nullable = false, length = 65535)
	public String getMoTa() {
		return this.moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	@Column(name = "AnhBia", nullable = false, length = 250)
	public String getAnhBia() {
		return this.anhBia;
	}

	public void setAnhBia(String anhBia) {
		this.anhBia = anhBia;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "NgayCapNhap", nullable = false, length = 19)
	public Date getNgayCapNhap() {
		return this.ngayCapNhap;
	}

	public void setNgayCapNhap(Date ngayCapNhap) {
		this.ngayCapNhap = ngayCapNhap;
	}

	@Column(name = "SoLuongTon", nullable = false)
	public int getSoLuongTon() {
		return this.soLuongTon;
	}

	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}

	@Column(name = "GioiTinh", nullable = false)
	public boolean isGioiTinh() {
		return this.gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	@Override
	public int compareTo(Sanpham sp) {
		// TODO Auto-generated method stub
		return this.maSanPham - sp.maSanPham;
	}

}

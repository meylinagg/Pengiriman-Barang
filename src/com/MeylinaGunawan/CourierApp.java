package com.MeylinaGunawan;

import com.MeylinaGunawanModel.Harga;
import com.MrylinaGunawanDAO.CourirerDAO;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class CourierApp extends javax.swing.JFrame {

    List<Harga> kotaTujuan;
    CourirerDAO dao = new CourirerDAO();

    public CourierApp() {
        kotaTujuan = dao.getHarga();
        for (Harga harga : kotaTujuan) {
            System.out.println("Kota "+ harga.getKotaTujuan());
//            cbxTujuan.addItem(""+harga);
        }
        initComponents();
        Date date = new Date();
        tanggalKirim.setDate(date);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pilihAsuransiButtonGroup = new javax.swing.ButtonGroup();
        pengirimanPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        namaPengirim = new javax.swing.JTextField();
        alamatPengirim = new javax.swing.JTextField();
        kodePosPengirim = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        kotaPengirim = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        teleponPengirim = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        provinsiPengirim = new javax.swing.JComboBox<>();
        penerimaPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        namaPenerima = new javax.swing.JTextField();
        alamatPenerima = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        kotaPenerima = new javax.swing.JComboBox<>();
        kodePosPenerima = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        teleponPenerima = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        provinsiPenerima = new javax.swing.JComboBox<>();
        dataPaketPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        nomorPaket = new javax.swing.JTextField();
        jenisBarang = new javax.swing.JTextField();
        beratBarang = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        tanggalKirim = new com.toedter.calendar.JDateChooser();
        kotaTujuanDataPaket = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        dimensiDataPaket = new javax.swing.JTextField();
        hargaBarang = new javax.swing.JTextField();
        pembayaranDataPaket = new javax.swing.JComboBox<>();
        Ya = new javax.swing.JRadioButton();
        Tidak = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jenisLayanan = new javax.swing.JComboBox<>();
        perhitunganPanel = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        hitungBeratPaket = new javax.swing.JLabel();
        hitungKotaTujuan = new javax.swing.JLabel();
        hitungJenisLayanan = new javax.swing.JLabel();
        hitungAsuransi = new javax.swing.JLabel();
        prosesButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pengirimanPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Pengiriman"));

        jLabel1.setText("Nama                       :");

        jLabel2.setText("Alamat                     :");

        jLabel3.setText("Kota dan Kode Pos :");

        jLabel5.setText("Provinsi                   :");

        alamatPengirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatPengirimActionPerformed(evt);
            }
        });

        jLabel9.setText("Telepon                   :");

        kotaPengirim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-pilih kota-", "Bandung", "Semarang", "Surabaya", "Timika", "Malang", "Tanggerang", "Tasik malaya", "Yogyakarta", "Medan" }));

        jLabel10.setText("-");

        jLabel14.setText("&");

        provinsiPengirim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-pilih provinsi-", "Sumatera utara", "Banten", "Jawa Barat", "Jawa Tengah", "Jawa Timur", "Papua" }));

        javax.swing.GroupLayout pengirimanPanelLayout = new javax.swing.GroupLayout(pengirimanPanel);
        pengirimanPanel.setLayout(pengirimanPanelLayout);
        pengirimanPanelLayout.setHorizontalGroup(
            pengirimanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pengirimanPanelLayout.createSequentialGroup()
                .addGroup(pengirimanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pengirimanPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaPengirim))
                    .addGroup(pengirimanPanelLayout.createSequentialGroup()
                        .addGroup(pengirimanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pengirimanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alamatPengirim)
                            .addGroup(pengirimanPanelLayout.createSequentialGroup()
                                .addComponent(kotaPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addComponent(kodePosPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pengirimanPanelLayout.createSequentialGroup()
                                .addComponent(provinsiPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(10, 10, 10))
            .addGroup(pengirimanPanelLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teleponPengirim)
                .addContainerGap())
        );
        pengirimanPanelLayout.setVerticalGroup(
            pengirimanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pengirimanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pengirimanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(namaPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pengirimanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(alamatPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pengirimanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(pengirimanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kotaPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kodePosPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)))
                .addGap(18, 18, 18)
                .addGroup(pengirimanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(provinsiPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pengirimanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(teleponPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        penerimaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Penerima"));

        jLabel6.setText("Nama                     :");

        jLabel7.setText(" Alamat                  :");

        alamatPenerima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatPenerimaActionPerformed(evt);
            }
        });

        jLabel11.setText("Kota dan Kode Pos:");

        jLabel13.setText("Provinsi                  :");

        kotaPenerima.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-pilih kota-", "Bandung", "Semarang", "Surabaya", "Timika", "Malang", "Tanggerang", "Tasik Malaya", "Yogyakarta", "Medan" }));
        kotaPenerima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotaPenerimaActionPerformed(evt);
            }
        });

        kodePosPenerima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodePosPenerimaActionPerformed(evt);
            }
        });

        jLabel8.setText(" Telepon                :");

        jLabel4.setText("-");

        jLabel12.setText("&");

        provinsiPenerima.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-pilih provinsi-", "Sumatera Utara", "Banten", "Jawa Barat", "Jawa Tengah", "Jawa Timur", "Papua" }));

        javax.swing.GroupLayout penerimaPanelLayout = new javax.swing.GroupLayout(penerimaPanel);
        penerimaPanel.setLayout(penerimaPanelLayout);
        penerimaPanelLayout.setHorizontalGroup(
            penerimaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penerimaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(penerimaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(penerimaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teleponPenerima))
                    .addGroup(penerimaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kotaPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kodePosPenerima))
                    .addGroup(penerimaPanelLayout.createSequentialGroup()
                        .addGroup(penerimaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(penerimaPanelLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(provinsiPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(penerimaPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(namaPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(penerimaPanelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(alamatPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        penerimaPanelLayout.setVerticalGroup(
            penerimaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penerimaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(penerimaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(namaPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(penerimaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alamatPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(penerimaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(kotaPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kodePosPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(penerimaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(provinsiPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(penerimaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(teleponPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dataPaketPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Paket"));

        jLabel15.setText("Nomor paket           :");

        jLabel16.setText("Kota Tujuan            :");

        jLabel17.setText("Jenis Barang           :");

        jLabel18.setText("Berat Barang          :");

        jLabel19.setText("Tanggal Kirim          :");

        beratBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beratBarangActionPerformed(evt);
            }
        });

        jLabel25.setText("/kg");

        kotaTujuanDataPaket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bandung", "Semarang", "Surabaya", "Timika", "Malang", "Tanggerang", "Tasikmalaya", "Yogyakarta", "Medan" }));
        kotaTujuanDataPaket.setToolTipText("");
        kotaTujuanDataPaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotaTujuanDataPaketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tanggalKirim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(beratBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jenisBarang))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomorPaket, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kotaTujuanDataPaket, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(nomorPaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(kotaTujuanDataPaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(beratBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(tanggalKirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel20.setText("Dimensi                    :");

        jLabel21.setText("Jenis Layanan          :");

        jLabel22.setText("Pilihan Asuransi        :");

        jLabel23.setText("Harga Assuransi       :");

        jLabel24.setText("Pembayaran             :");

        pembayaranDataPaket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-pilih pembayaran-", "Cash", "Debit", "CC" }));

        pilihAsuransiButtonGroup.add(Ya);
        Ya.setText("Ya");
        Ya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YaActionPerformed(evt);
            }
        });

        pilihAsuransiButtonGroup.add(Tidak);
        Tidak.setText("Tidak");
        Tidak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TidakActionPerformed(evt);
            }
        });

        jLabel26.setText("(P x L x T)");

        jenisLayanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-pilih jenis layanan-", "Reguler", "Kilat", "SDS", "ONS", "HDS" }));
        jenisLayanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisLayananActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dataPaketPanelLayout = new javax.swing.GroupLayout(dataPaketPanel);
        dataPaketPanel.setLayout(dataPaketPanelLayout);
        dataPaketPanelLayout.setHorizontalGroup(
            dataPaketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPaketPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(dataPaketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataPaketPanelLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hargaBarang))
                    .addGroup(dataPaketPanelLayout.createSequentialGroup()
                        .addGroup(dataPaketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dataPaketPanelLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jenisLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dataPaketPanelLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dimensiDataPaket, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel26))
                            .addGroup(dataPaketPanelLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pembayaranDataPaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dataPaketPanelLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(11, 11, 11)
                                .addComponent(Ya)
                                .addGap(18, 18, 18)
                                .addComponent(Tidak)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        dataPaketPanelLayout.setVerticalGroup(
            dataPaketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPaketPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(dataPaketPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dataPaketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(dimensiDataPaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataPaketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jenisLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataPaketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(Ya)
                    .addComponent(Tidak))
                .addGap(11, 11, 11)
                .addGroup(dataPaketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(hargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataPaketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(pembayaranDataPaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        perhitunganPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Perhitungan"));

        jLabel27.setText("Berat Paket                :");

        jLabel28.setText("Kota Tujuan               :");

        jLabel29.setText("Jenis Layanan            :");

        jLabel30.setText("Asuransi (jika dipilih)  :");

        hitungBeratPaket.setText("         ");

        hitungKotaTujuan.setText("          ");

        hitungJenisLayanan.setText("             ");

        hitungAsuransi.setText("        ");

        javax.swing.GroupLayout perhitunganPanelLayout = new javax.swing.GroupLayout(perhitunganPanel);
        perhitunganPanel.setLayout(perhitunganPanelLayout);
        perhitunganPanelLayout.setHorizontalGroup(
            perhitunganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perhitunganPanelLayout.createSequentialGroup()
                .addGroup(perhitunganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(perhitunganPanelLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hitungBeratPaket))
                    .addGroup(perhitunganPanelLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hitungKotaTujuan))
                    .addGroup(perhitunganPanelLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hitungJenisLayanan))
                    .addGroup(perhitunganPanelLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hitungAsuransi)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        perhitunganPanelLayout.setVerticalGroup(
            perhitunganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perhitunganPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(perhitunganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(hitungBeratPaket))
                .addGap(12, 12, 12)
                .addGroup(perhitunganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(hitungKotaTujuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(perhitunganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(hitungJenisLayanan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(perhitunganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(hitungAsuransi)))
        );

        prosesButton.setText("Proses");
        prosesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Data Master");

        jMenuItem1.setText("Cek");
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Print");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pengirimanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penerimaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(perhitunganPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(prosesButton))
                    .addComponent(dataPaketPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pengirimanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(penerimaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataPaketPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perhitunganPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prosesButton))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alamatPengirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatPengirimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatPengirimActionPerformed

    private void alamatPenerimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatPenerimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatPenerimaActionPerformed

    private void kodePosPenerimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodePosPenerimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodePosPenerimaActionPerformed

    private void YaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YaActionPerformed
        // TODO add your handling code here:
        String PilihAsuransi = "";
        if (Ya.isSelected()) {
            PilihAsuransi = Ya.getText();
            hitungAsuransi.setText("Ya");
            if (kotaTujuanDataPaket.getSelectedItem().equals("Bandung")) {
                hargaBarang.setText("10000");
                hitungKotaTujuan.setText("Bandung");
            }
            if (kotaTujuanDataPaket.getSelectedItem().equals("Semarang")) {
                hargaBarang.setText("16000");
            }
            if (kotaTujuanDataPaket.getSelectedItem().equals("Surabaya")) {
                hargaBarang.setText("18000");
            }
            if (kotaTujuanDataPaket.getSelectedItem().equals("Timika")) {
                hargaBarang.setText("20000");
            }
            if (kotaTujuanDataPaket.getSelectedItem().equals("Malang")) {
                hargaBarang.setText("18000");
            }
            if (kotaTujuanDataPaket.getSelectedItem().equals("Tanggerang")) {
                hargaBarang.setText("8000");
            }
            if (kotaTujuanDataPaket.getSelectedItem().equals("Tasik Malaya")) {
                hargaBarang.setText("12000");
            }
            if (kotaTujuanDataPaket.getSelectedItem().equals("Yogyakarta")) {
                hargaBarang.setText("16000");
            }
            if (kotaTujuanDataPaket.getSelectedItem().equals("Medan")) {
                hargaBarang.setText("20000");
            }
        } else {
            if (Tidak.isSelected()) {
                PilihAsuransi = Tidak.getText();

            }
        }
    }//GEN-LAST:event_YaActionPerformed

    private void kotaTujuanDataPaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotaTujuanDataPaketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kotaTujuanDataPaketActionPerformed

    private void prosesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesButtonActionPerformed
        // TODO add your handling code here:
        hitungBeratPaket.setText(beratBarang.getText());
        if (namaPenerima.getText().equals("") || namaPengirim.getText().equals("") || alamatPenerima.getText().equals("")
                || alamatPengirim.getText().equals("") || kotaPenerima.getSelectedItem().equals("") || kotaPengirim.getSelectedItem().equals("")
                || kodePosPenerima.getText().equals("") || kodePosPengirim.getText().equals("") || provinsiPenerima.getSelectedItem().equals("")
                || provinsiPengirim.getSelectedItem().equals("") || teleponPenerima.getText().equals("") || teleponPengirim.getText().equals("")
                || jenisBarang.getText().equals("") || beratBarang.getText().equals("") || jenisBarang.getText().equals("")
                || dimensiDataPaket.getText().equals("") || tanggalKirim.getDate().equals("") || jenisLayanan.getSelectedItem().equals("")
                || pilihAsuransiButtonGroup.getSelection().equals("") || pembayaranDataPaket.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Data Telah DiProses");
        }
    }//GEN-LAST:event_prosesButtonActionPerformed

    private void TidakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TidakActionPerformed
        // TODO add your handling code here:
        if (Tidak.isSelected()) {
            hargaBarang.setText("0");
            hitungAsuransi.setText("Tidak");
        }
    }//GEN-LAST:event_TidakActionPerformed

    private void jenisLayananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisLayananActionPerformed
        // TODO add your handling code here:
        if (jenisLayanan.getSelectedItem().equals("Reguler")) {
            hitungJenisLayanan.setText("Reguler");
        }
        if (jenisLayanan.getSelectedItem().equals("Kilat")) {
            hitungJenisLayanan.setText("Kilat");
        }
        if (jenisLayanan.getSelectedItem().equals("SDS")) {
            hitungJenisLayanan.setText("SDS");
        }
        if (jenisLayanan.getSelectedItem().equals("ONS")) {
            hitungJenisLayanan.setText("ONS");
        }
        if (jenisLayanan.getSelectedItem().equals("HDS")) {
            hitungJenisLayanan.setText("HDS");
        }
    }//GEN-LAST:event_jenisLayananActionPerformed

    private void beratBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beratBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beratBarangActionPerformed

    private void kotaPenerimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotaPenerimaActionPerformed
        // TODO add your handling code here:
        if (kotaPenerima.getSelectedItem().equals("Bandung")) {
            kotaTujuanDataPaket.setSelectedItem("Bandung");
            hitungKotaTujuan.setText("Bandung");
            provinsiPenerima.setSelectedItem("Jawa Barat");
        }
        if (kotaPenerima.getSelectedItem().equals("Semarang")) {
            kotaTujuanDataPaket.setSelectedItem("Semarang");
            hitungKotaTujuan.setText("Semarang");
            provinsiPenerima.setSelectedItem("Jawa Tengah");
        }
        if (kotaPenerima.getSelectedItem().equals("Surabaya")) {
            kotaTujuanDataPaket.setSelectedItem("Surabaya");
            hitungKotaTujuan.setText("Surabaya");
            provinsiPenerima.setSelectedItem("Jawa Timur");
        }
        if (kotaPenerima.getSelectedItem().equals("Timika")) {
            kotaTujuanDataPaket.setSelectedItem("Timika");
            hitungKotaTujuan.setText("Timika");
            provinsiPenerima.setSelectedItem("Papua");
        }
        if (kotaPenerima.getSelectedItem().equals("Malang")) {
            kotaTujuanDataPaket.setSelectedItem("Malang");
            hitungKotaTujuan.setText("Malang");
            provinsiPenerima.setSelectedItem("Jawa Timur");
        }
        if (kotaPenerima.getSelectedItem().equals("Tanggerang")) {
            kotaTujuanDataPaket.setSelectedItem("Tanggerang");
            hitungKotaTujuan.setText("Tanggerang");
            provinsiPenerima.setSelectedItem("Banten");
        }
        if (kotaPenerima.getSelectedItem().equals("Tasik Malaya")) {
            kotaTujuanDataPaket.setSelectedItem("Tasik Malaya");
            hitungKotaTujuan.setText("Tasik Malaya");
            provinsiPenerima.setSelectedItem("Jawa Barat");
        }
        if (kotaPenerima.getSelectedItem().equals("Yogyakarta")) {
            kotaTujuanDataPaket.setSelectedItem("Yogyakarta");
            hitungKotaTujuan.setText("Yogyakarta");
            provinsiPenerima.setSelectedItem("Jawa Tengah");
        }
        if (kotaPenerima.getSelectedItem().equals("Medan")) {
            kotaTujuanDataPaket.setSelectedItem("Medan");
            hitungKotaTujuan.setText("Medan");
            provinsiPenerima.setSelectedItem("Sumatera Utara");
        }
    }//GEN-LAST:event_kotaPenerimaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CourierApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourierApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourierApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourierApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourierApp().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Tidak;
    private javax.swing.JRadioButton Ya;
    private javax.swing.JTextField alamatPenerima;
    private javax.swing.JTextField alamatPengirim;
    private javax.swing.JTextField beratBarang;
    private javax.swing.JPanel dataPaketPanel;
    private javax.swing.JTextField dimensiDataPaket;
    private javax.swing.JTextField hargaBarang;
    private javax.swing.JLabel hitungAsuransi;
    private javax.swing.JLabel hitungBeratPaket;
    private javax.swing.JLabel hitungJenisLayanan;
    private javax.swing.JLabel hitungKotaTujuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jenisBarang;
    private javax.swing.JComboBox<String> jenisLayanan;
    private javax.swing.JTextField kodePosPenerima;
    private javax.swing.JTextField kodePosPengirim;
    private javax.swing.JComboBox<String> kotaPenerima;
    private javax.swing.JComboBox<String> kotaPengirim;
    private javax.swing.JComboBox<String> kotaTujuanDataPaket;
    private javax.swing.JTextField namaPenerima;
    private javax.swing.JTextField namaPengirim;
    private javax.swing.JTextField nomorPaket;
    private javax.swing.JComboBox<String> pembayaranDataPaket;
    private javax.swing.JPanel penerimaPanel;
    private javax.swing.JPanel pengirimanPanel;
    private javax.swing.JPanel perhitunganPanel;
    private javax.swing.ButtonGroup pilihAsuransiButtonGroup;
    private javax.swing.JButton prosesButton;
    private javax.swing.JComboBox<String> provinsiPenerima;
    private javax.swing.JComboBox<String> provinsiPengirim;
    private com.toedter.calendar.JDateChooser tanggalKirim;
    private javax.swing.JTextField teleponPenerima;
    private javax.swing.JTextField teleponPengirim;
    // End of variables declaration//GEN-END:variables
}

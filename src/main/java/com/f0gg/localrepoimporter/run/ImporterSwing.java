package com.f0gg.localrepoimporter.run;

import java.io.File;
import java.io.InputStream;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class ImporterSwing extends javax.swing.JFrame {

    Properties properties = new Properties();

    public ImporterSwing() {
        initComponents();
        setLocationRelativeTo(null);
        dialogPomExample.setLocationRelativeTo(null);
        dialogPomExample.setSize(512, 273);

        properties = new Properties();
        try {
            properties.load(FileUtils.openInputStream(new File("config.properties")));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(getParent(), "Oops! Error:\r\n" + ex.getMessage());
            System.exit(1);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        localRepoChooser = new javax.swing.JFileChooser();
        jarChooser = new javax.swing.JFileChooser();
        dialogPomExample = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        pomFileExample = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnClosePomExample = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtLocalRepoPath = new javax.swing.JTextField();
        btnChooseLocalRepo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtJarFile = new javax.swing.JTextField();
        btnChooseJarFile = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtGroupID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtArtifactID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtVersion = new javax.swing.JTextField();
        btnGenerate = new javax.swing.JButton();
        btnPomExample = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtJarInfo = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtConsole = new javax.swing.JTextArea();

        localRepoChooser.setDialogTitle("Select your maven local repo path");
        localRepoChooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        jarChooser.setDialogTitle("Select JAR file");
        jarChooser.setFileFilter(new JarFileFilter());

        pomFileExample.setColumns(20);
        pomFileExample.setRows(5);
        pomFileExample.setText("<repositories>\n    <repository>\n        <id>local.repo</id>\n        <name>Local Repo</name>\n        <url>file:${project.basedir}/repo</url>\n    </repository>\n</repositories>\n");
        jScrollPane1.setViewportView(pomFileExample);

        jTextField1.setText("https://devcenter.heroku.com/articles/local-maven-dependencies");

        jLabel6.setText("More information:");

        btnClosePomExample.setText("Close");
        btnClosePomExample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClosePomExampleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogPomExampleLayout = new javax.swing.GroupLayout(dialogPomExample.getContentPane());
        dialogPomExample.getContentPane().setLayout(dialogPomExampleLayout);
        dialogPomExampleLayout.setHorizontalGroup(
            dialogPomExampleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogPomExampleLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(dialogPomExampleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogPomExampleLayout.createSequentialGroup()
                        .addComponent(btnClosePomExample)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        dialogPomExampleLayout.setVerticalGroup(
            dialogPomExampleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogPomExampleLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogPomExampleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClosePomExample))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Maven Local Repo Importer");

        jLabel1.setText("Your maven local repo");

        btnChooseLocalRepo.setText("...");
        btnChooseLocalRepo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseLocalRepoActionPerformed(evt);
            }
        });

        jLabel2.setText("JAR file to be imported");

        btnChooseJarFile.setText("...");
        btnChooseJarFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseJarFileActionPerformed(evt);
            }
        });

        jLabel3.setText("groupId");

        jLabel4.setText("artifactId");

        jLabel5.setText("version");

        btnGenerate.setText("Generate");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        btnPomExample.setText("POM Example");
        btnPomExample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPomExampleActionPerformed(evt);
            }
        });

        txtJarInfo.setColumns(20);
        txtJarInfo.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        txtJarInfo.setRows(3);
        jScrollPane2.setViewportView(txtJarInfo);

        txtConsole.setColumns(20);
        txtConsole.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        txtConsole.setRows(5);
        jScrollPane3.setViewportView(txtConsole);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtLocalRepoPath, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnChooseLocalRepo))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnPomExample)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnGenerate))
                        .addComponent(txtGroupID, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(txtJarFile, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnChooseJarFile))
                        .addComponent(txtArtifactID, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtVersion, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLocalRepoPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChooseLocalRepo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJarFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChooseJarFile)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGroupID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtArtifactID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGenerate)
                            .addComponent(btnPomExample))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChooseLocalRepoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseLocalRepoActionPerformed
        localRepoChooser.showOpenDialog(this);
        txtLocalRepoPath.setText(localRepoChooser.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_btnChooseLocalRepoActionPerformed

    private void btnChooseJarFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseJarFileActionPerformed
        jarChooser.showOpenDialog(this);
        txtJarFile.setText(jarChooser.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_btnChooseJarFileActionPerformed

    private void btnClosePomExampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClosePomExampleActionPerformed
        dialogPomExample.dispose();
    }//GEN-LAST:event_btnClosePomExampleActionPerformed

    private void btnPomExampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPomExampleActionPerformed
        dialogPomExample.setModal(true);
        dialogPomExample.setVisible(true);
    }//GEN-LAST:event_btnPomExampleActionPerformed

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed

        try {
            // debug
            /*
            txtLocalRepoPath.setText("C:\\DESENVOLVIMENTO\\github\\local-repo-importer\\repo");
            txtJarFile.setText("C:\\DESENVOLVIMENTO\\github\\local-repo-importer\\proconsoledap.jar");
            txtGroupID.setText("testea");
            txtArtifactID.setText("testeb");
            txtVersion.setText("1.0");
            */

            StringBuilder command = new StringBuilder();
            command.append(" deploy:deploy-file");
            command.append(" -Durl=file:///").append(txtLocalRepoPath.getText());
            command.append(" -Dfile=").append(txtJarFile.getText());
            command.append(" -DgroupId=").append(txtGroupID.getText());
            command.append(" -DartifactId=").append(txtArtifactID.getText());
            command.append(" -Dpackaging=jar");
            command.append(" -Dversion=").append(txtVersion.getText());

            Runtime rt = Runtime.getRuntime();
            String mvnFile = properties.getProperty("full.path.mvn.file");
            Process p = rt.exec(mvnFile + command.toString());
            InputStream in = p.getInputStream();
            InputStream err = p.getErrorStream();
            //OutputStream out = p.getOutputStream();

            txtConsole.setText(new String(IOUtils.toByteArray(in)));
            
            StringBuilder dep = new StringBuilder();
            dep.append("<dependency>\r\n");
            dep.append("    <groupId>AAA</groupId>\r\n");
            dep.append("    <artifactId>BBB</artifactId>\r\n");
            dep.append("    <version>CCC</version>\r\n");
            dep.append("</dependency>\r\n");
            txtJarInfo.setText(dep.toString().replace("AAA", txtGroupID.getText())
                    .replace("BBB", txtArtifactID.getText())
                    .replace("CCC", txtVersion.getText()));
            
            // console debug
            IOUtils.copy(in, System.out);
            IOUtils.copy(err, System.out);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }//GEN-LAST:event_btnGenerateActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImporterSwing().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseJarFile;
    private javax.swing.JButton btnChooseLocalRepo;
    private javax.swing.JButton btnClosePomExample;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnPomExample;
    private javax.swing.JDialog dialogPomExample;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JFileChooser jarChooser;
    private javax.swing.JFileChooser localRepoChooser;
    private javax.swing.JTextArea pomFileExample;
    private javax.swing.JTextField txtArtifactID;
    private javax.swing.JTextArea txtConsole;
    private javax.swing.JTextField txtGroupID;
    private javax.swing.JTextField txtJarFile;
    private javax.swing.JTextArea txtJarInfo;
    private javax.swing.JTextField txtLocalRepoPath;
    private javax.swing.JTextField txtVersion;
    // End of variables declaration//GEN-END:variables
}

/**
 * Only JAR files filter
 */
class JarFileFilter extends FileFilter {

    private final String[] okFileExtensions = new String[]{"jar"};

    public boolean accept(File file) {
        if (file.isDirectory()) {
            return true;
        }

        for (String extension : okFileExtensions) {
            if (file.getName().toLowerCase().endsWith(extension)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getDescription() {
        return "JAR file";
    }
}
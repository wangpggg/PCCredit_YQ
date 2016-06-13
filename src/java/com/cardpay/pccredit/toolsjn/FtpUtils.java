package com.cardpay.pccredit.toolsjn;

import java.util.ArrayList;
import java.util.Properties;
import java.util.Vector;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class FtpUtils {
	public static String bank_ftp_host="61.98.0.33";  			// ftp地址
	public static int bank_ftp_port = 21;						// ftp端口
	public static String bank_ftp_username="root";  			// ftp用户名
	public static String bank_ftp_password="1234567";  			// ftp密码
	public static String bank_ftp_path="/xwd/";     			// ftp文件目录
	
//	public static String bank_ftp_down_path="E://jndownload//"; // 下载本地目录
	public static String bank_ftp_down_path="/xwd31/"; 			// 下发数据存放
	private ChannelSftp sftp = null;


	public void connect() throws JSchException, SftpException {
		JSch jsch = new JSch();
		Session session = jsch.getSession(bank_ftp_username, bank_ftp_host);
		//如果服务器连接不上，则抛出异常    
		if (session == null) {        
			System.out.println("session is null");   
			}
		if (bank_ftp_password != null
				&& !bank_ftp_password.equalsIgnoreCase("")) {
			session.setPassword(bank_ftp_password);
		}
		Properties sshConfig = new Properties();
		sshConfig.put("StrictHostKeyChecking", "no");

		session.setConfig(sshConfig);

		session.setServerAliveInterval(92000);
		session.connect();

		Channel channel = session.openChannel("sftp");

		channel.connect();
		sftp = (ChannelSftp) channel;
		sftp.setFilenameEncoding("GBK");
	}

	/**
	 * 获取ftp目录下制卡结果文件
	 * @param directory
	 * @return
	 * @throws SftpException
	 */
	public ArrayList<String> getList(String directory) throws SftpException {
		ArrayList<String> files = new ArrayList<String>();
		Vector vv = sftp.ls(directory);
		if (vv != null) {
			for (int i = 0; i < vv.size(); i++) {
				Object obj = vv.elementAt(i);
				if (obj instanceof com.jcraft.jsch.ChannelSftp.LsEntry) {
					String path = ((com.jcraft.jsch.ChannelSftp.LsEntry) obj)
							.getFilename();
					files.add(path);

				}
			}
		}
		return files;
	}

	/**
	 * 下载文件
	 * @param directory	            下载目录
	 * @param downloadFile  下载的文件
	 * @param saveFile 		存在本地的路径
	 */
	public boolean download(String directory, String downloadFile,
			String saveFile) {
		try {
			if (sftp == null) {
			 //如果没连接上sftp则连接
				connect(); 
			}
			sftp.cd(directory);
			sftp.get(downloadFile, saveFile);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 关闭sftp连接
	 */
	public void close() {
		if (sftp != null) {
			try {
				sftp.getSession().disconnect();
			} catch (JSchException e) {
				e.printStackTrace();
			}
			sftp.disconnect();
		}
	}
}

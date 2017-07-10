package com.sist.r;

import org.rosuda.REngine.Rserve.RConnection;
import org.springframework.stereotype.Component;

@Component
public class RManager {

	public void rGraph(int no){
		switch (no) {
		case 1:
			barplot();
			break;
		case 2:
			pie();
			break;
		case 3:
			pie3D();
			break;
		case 4:
			treemap();
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			
			break;
		case 8:
			
			break;
		case 9:
			
			break;
		case 10:
			
			break;

		default:
			break;
		}
		
	}
	/*
	 * voidEval(); //일반 명령어
	 * eval(); //데이터를 얻어올때
	 * 
	 * 순서
	 * 1) R서버에 연결
	 * 	RConnection rc=new RConnection();
	 * 2) 명령어를 전송
	 * 3) 그림을 그려라 ...
	 * 
	 * 	barplot(height(숫자), 라벨, 칼라, 글자크기)
	 * 			======       ===   ===  ======
	 * 						names.arg
	 * 							   col
	 * 									cex.name
	 * 
	 * */
	
	public void barplot(){
		try {
			RConnection rc=new RConnection();
			//데이터 읽기 => 파일(csv, 엑셀, txt)
			//몽고디비
			//오라클
			rc.voidEval("library(rJava)");
			rc.voidEval("library(Rserve)");
			rc.voidEval("library(RMongo)");//Rserve를 돌려야 아래 매소드 사용 가능
			rc.voidEval("mongo<-mongoDbConnect(\"mydb\", \"211.238.142.104\", 27017)");
			rc.voidEval("data<-dbGetQuery(mongo, \"student\", \"{}\")");
			rc.voidEval("png(\"/home/sist/bigdataDev/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/RAndJavaFinalProject//main/graph.png\", width=700, height=500)");
			rc.voidEval("barplot(data$avg, names.arg = data$name, col = rainbow(15), cex.name=0.3)");
			rc.voidEval("dev.off()");
			rc.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	public void pie(){
		try {
			RConnection rc=new RConnection();
			//데이터 읽기 => 파일(csv, 엑셀, txt)
			//몽고디비
			//오라클
			rc.voidEval("library(rJava)");
			rc.voidEval("library(Rserve)");//Rserve를 돌려야 아래 매소드 사용 가능
			rc.voidEval("library(RMongo)");//Rserve를 돌려야 아래 매소드 사용 가능
			rc.voidEval("mongo<-mongoDbConnect(\"mydb\", \"211.238.142.104\", 27017)");
			rc.voidEval("data<-dbGetQuery(mongo, \"student\", \"{}\")");
			rc.voidEval("png(\"/usr/local/sts-bundle/pivotal-tc-server-developer-3.1.3.SR1/base-instance/wtpwebapps/RAndJavaFinalProject/main/graph.png\", width=700, height=500)");
			rc.voidEval("pie(data$avg, labels = data$name, col = rainbow(15))");
			rc.voidEval("dev.off()");
			rc.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	public void pie3D(){
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	public void treemap(){
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	
}

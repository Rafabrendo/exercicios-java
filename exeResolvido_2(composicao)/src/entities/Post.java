package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	//O private static é para que eu não precise ter varias cópias do SimpleDateFormat. Daí eu vou ter
	//só uma para a minha aplicação inteira
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	List<Comment> comments = new ArrayList<>(); //Associação de objetos
	
	public Post() {
	}

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}
	//Obs.:Não se pode ter o metodo set recebendo outra lisa para trocar de lista
	
	//No lugar do setList, adicione um metodo que adicona "contratos"(comentarios) como argumentos
	public void addComment(Comment comment){
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}

	
	public String toString() {
		StringBuilder sb = new StringBuilder();//sb vai permitir a concatenação de outras strings a partir do metodo append(acrescenta no final)
		sb.append(title + "\n"); //Acrescentar no final
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment)+"\n");
		sb.append(content+"\n");
		sb.append("Comments: \n");
		for(Comment c: comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString(); //Conversão do StringBuilder para to String.
	}
	
	
	
	
}

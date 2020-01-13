package Model;

import java.util.Date;

/**
 * Created by pana on 13/01/20.
 */
public class Batch {
    private Long batchNumber;
    private Date startDate;
    private Date endDate;
    private Long trainingId;
    private int maxParticipants;
    public Long trainierId;

    public Batch(Date startDate, Date endDate, Long trainingId, int maxParticipants, Long trainierId) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.trainingId = trainingId;
        this.maxParticipants = maxParticipants;
        this.trainierId = trainierId;
    }

    public Long getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(Long batchNumber) {
        this.batchNumber = batchNumber;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(Long trainingId) {
        this.trainingId = trainingId;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }
}

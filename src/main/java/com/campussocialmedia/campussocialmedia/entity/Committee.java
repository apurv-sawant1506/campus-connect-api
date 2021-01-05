package com.campussocialmedia.campussocialmedia.entity;

import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamoDBTable(tableName = "Committee")
public class Committee {
    @DynamoDBAttribute
    private String name;

    @DynamoDBAttribute
    private String about;

    @DynamoDBAttribute
    private String logoURL;

    @DynamoDBAttribute
    private List<CommitteeMembers> committeeMembers;

    @DynamoDBAttribute
    private List<String> followers;
}
